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
import java.sql.Timestamp;
import java.util.ArrayList;
import models.Role;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class RoleCnt {
    public ArrayList<Role> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Role> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Roles;");
            while(rs.next()) {
                Role row = new Role(rs.getInt(1), rs.getString(2));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Role findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Role result = new Role(0, "");
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Roles WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Role(rs.getInt(1), rs.getString(2));
            }
            con.close();
        }
        return result;
    }
}
