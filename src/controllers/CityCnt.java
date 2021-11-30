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

import models.City;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class CityCnt {
    public ArrayList<City> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<City> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, Name, IsActive, IsDeleted, StateId FROM Cities;");
            while(rs.next()) {
                City row = new City(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public City findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        City result = new City(0, "", 0, 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, IsActive, IsDeleted, StateId FROM Cities WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new City(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
            con.close();
        }
        return result;
    }
    
    public void add(City data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Cities (Name, IsActive, IsDeleted, StateId) VALUES (?, ?, ?, ?);");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            stmt.setInt(4, data.getStateId());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Ciudad añadida correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, City data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Cities SET Name = ?, IsActive = ?, IsDeleted = ?, StateId = ? WHERE Id = ?;");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            stmt.setInt(4, data.getStateId());
            stmt.setInt(5, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Ciudad actualizada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Cities WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Ciudad eliminada correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
