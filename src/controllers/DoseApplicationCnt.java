/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import models.DoseApplication;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class DoseApplicationCnt {
    public ArrayList<DoseApplication> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<DoseApplication> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, PatientId, VaccineId, DoseNumber, IsActive, IsDeleted FROM DoseApplications;");
            while(rs.next()) {
                DoseApplication row = new DoseApplication(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public DoseApplication findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        DoseApplication result = new DoseApplication(0, 0, 0, 0, 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, IsActive, IsDeleted, StateId FROM DoseApplications WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new DoseApplication(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
            }
            con.close();
        }
        return result;
    }
    
    public void add(DoseApplication data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO DoseApplications (PatientId, VaccineId, DoseNumber, IsActive, IsDeleted) VALUES (?, ?, ?, ?, ?);");
            stmt.setInt(1, data.getPatientId());
            stmt.setInt(2, data.getVaccineId());
            stmt.setInt(3, data.getDoseNumber());
            stmt.setInt(4, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Aplicación de dosis añadida correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, DoseApplication data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE DoseApplications SET PatientId = ?, VaccineId = ?, DoseNumber = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setInt(1, data.getPatientId());
            stmt.setInt(2, data.getVaccineId());
            stmt.setInt(3, data.getDoseNumber());
            stmt.setInt(4, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            stmt.setInt(6, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Aplicación de dosis actualizada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM DoseApplications WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Aplicación de dosis eliminada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
