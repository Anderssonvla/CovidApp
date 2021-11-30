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

import models.User;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class UserCnt {
    public ArrayList<User> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<User> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, RoleId, FirstName, LastName, Password, IsActive, IsDeleted FROM Users;");
            while(rs.next()) {
                User row = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public User findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        User result = new User(0, 0, "", "", "", 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, RoleId, FirstName, LastName, Password, IsActive, IsDeleted FROM Users WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
            }
            con.close();
        }
        return result;
    }
    
    public void add(User data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Users (RoleId, FirstName, LastName, Password, IsActive, IsDeleted) VALUES (?, ?, ?, ?, ?, ?);");
            stmt.setInt(1, data.getRoleId());
            stmt.setString(2, data.getFirstName());
            stmt.setString(3, data.getLastName());
            stmt.setString(4, data.getPassword());
            stmt.setInt(5, data.getIsActive());
            stmt.setInt(6, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Usuario añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, User data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Users SET RoleId = ?, FirstName = ?, LastName = ?, Password = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setInt(1, data.getRoleId());
            stmt.setString(2, data.getFirstName());
            stmt.setString(3, data.getLastName());
            stmt.setString(4, data.getPassword());
            stmt.setInt(5, data.getIsActive());
            stmt.setInt(6, data.getIsDeleted());
            stmt.setInt(7, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Usuario actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Users WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Usuario eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
