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

import models.Hospital;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class HospitalCnt {
    public ArrayList<Hospital> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Hospital> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, Name, IntUnitCares, IsActive, IsDeleted FROM Hospitals;");
            while(rs.next()) {
                Hospital row = new Hospital(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Hospital findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Hospital result = new Hospital(0, "", 0, 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, IntUnitCares, IsActive, IsDeleted FROM Hospitals WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Hospital(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
            con.close();
        }
        return result;
    }
    
    public void add(Hospital data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Hospitals (Name, IntUnitCares, IsActive, IsDeleted) VALUES (?, ?, ?, ?);");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIntUnitCares());
            stmt.setInt(3, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Hospital añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, Hospital data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Hospitals SET Name = ?, IntUnitCares = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIntUnitCares());
            stmt.setInt(3, data.getIsActive());
            stmt.setInt(4, data.getIsDeleted());
            stmt.setInt(5, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Hospital actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Hospitals WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Hospital eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
