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

import models.State;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class StateCnt {
    public ArrayList<State> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<State> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, Name, IsActive, IsDeleted, ISOCode FROM States;");
            while(rs.next()) {
                State row = new State(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public State findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        State result = new State(0, "", 0, 0, "");
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, Name, IsActive, IsDeleted, ISOCode FROM States WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new State(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
            }
            con.close();
        }
        return result;
    }
    
    public void add(State data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO States (Name, IsActive, IsDeleted, ISOCode) VALUES (?, ?, ?, ?);");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            stmt.setString(4, data.getISOCode());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Departamento/estado/provincia añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, State data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE States SET Name = ?, IsActive = ?, IsDeleted = ?, ISOCode = ? WHERE Id = ?;");
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getIsActive());
            stmt.setInt(3, data.getIsDeleted());
            stmt.setString(4, data.getISOCode());
            stmt.setInt(5, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Departamento/estado/provincia actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM States WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Departamento/estado/provincia eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
