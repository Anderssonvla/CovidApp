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

import models.Vaccine;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class VaccineCnt {
    public ArrayList<Vaccine> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Vaccine> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, Name, IsActive, IsDeleted FROM Vaccines;");
            while(rs.next()) {
                Vaccine row = new Vaccine(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Vaccine findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Vaccine result = new Vaccine(0, "", 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, IsActive, IsDeleted FROM Vaccines WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Vaccine(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
            con.close();
        }
        return result;
    }
    
    public void add(Vaccine data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Vaccines (Name, IsActive, IsDeleted) VALUES (?);");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Vacuna añadida correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, Vaccine data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Vaccines SET Name = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            stmt.setInt(4, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Vacuna actualizada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Vaccines WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Vacuna eliminada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
