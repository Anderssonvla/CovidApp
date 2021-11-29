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

import models.Case;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class CaseCnt {
    public ArrayList<Case> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Case> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cases;");
            while(rs.next()) {
                Case row = new Case(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Case findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Case result = new Case(0, 0, 0, 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Cases WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Case(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
            con.close();
        }
        return result;
    }
    
    public void add(Case data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Cases (PatientId, HospitalId, IsActive, IsDeleted) VALUES (?, ?, ?, ?);");
            stmt.setInt(1, data.getPatientId());
            stmt.setInt(2, data.getHospitalId());
            stmt.setInt(3, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Caso añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, Case data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Roles SET PatientId = ?, HospitalId = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setInt(1, data.getPatientId());
            stmt.setInt(2, data.getHospitalId());
            stmt.setInt(3, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            stmt.setInt(5, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Caso actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Cases WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Caso eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
