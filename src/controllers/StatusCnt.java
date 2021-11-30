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

import models.Status;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class StatusCnt {
    public ArrayList<Status> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Status> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, Name, Description, TableName, Field FROM Status;");
            while(rs.next()) {
                Status row = new Status(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Status findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Status result = new Status(0, "", "", "", "");
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, Description, TableName, Field FROM Status WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Status(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            con.close();
        }
        return result;
    }
    
    public void add(Status data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Status (Name, Description, TableName, Field) VALUES (?, ?, ?, ?);");
            stmt.setString(1, data.getName());
            stmt.setString(2, data.getDescription());
            stmt.setString(3, data.getTableName());
            stmt.setString(4, data.getField());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Status añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, Status data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Status SET Name = ?, Description = ?, TableName = ?, Field = ? WHERE Id = ?;");
            stmt.setString(1, data.getName());
            stmt.setString(2, data.getDescription());
            stmt.setString(3, data.getTableName());
            stmt.setString(4, data.getField());
            stmt.setInt(5, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Status actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Status WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Status eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
