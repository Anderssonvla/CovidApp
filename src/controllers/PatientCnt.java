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

import models.Patient;
import services.DatabaseConnection;

/**
 *
 * @author PredatorDev
 */
public class PatientCnt {
    public ArrayList<Patient> find() throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        ArrayList<Patient> result = new ArrayList<>();
        try (Connection con = db.getConn()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Id, CityId, StateId, FirstName, LastName, Age, DUI, SocialNumber, NotableIllneses, Gender, Status, IsActive, IsDeleted FROM Patients;");
            while(rs.next()) {
                Patient row = new Patient(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13));
                result.add(row);
            }
            con.close();
        }
        return result.isEmpty() ? null : result;
    }
    
    public Patient findOne(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        Patient result = new Patient(0, 0, 0, "", "", 0, "", "", 0, 0, 0, 0, 0);
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT Id, CityId, StateId, FirstName, LastName, Age, DUI, SocialNumber, NotableIllneses, Gender, Status, IsActive, IsDeleted FROM Patients WHERE Id = ?;");
            stmt.setInt(1, Id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                result = new Patient(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13));
            }
            con.close();
        }
        return result;
    }
    
    public void add(Patient data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Patients (CityId, StateId, FirstName, LastName, Age, DUI, SocialNumber, NotableIllneses, Gender, Status, IsActive, IsDeleted) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            stmt.setInt(1, data.getCityId());
            stmt.setInt(2, data.getStateId());
            stmt.setString(3, data.getFirstName());
            stmt.setString(4, data.getLastName());
            stmt.setInt(5, data.getAge());
            stmt.setString(6, data.getDUI());
            stmt.setString(7, data.getSocialNumber());
            stmt.setInt(8, data.getNotableIllneses());
            stmt.setInt(9, data.getGender());
            stmt.setInt(10, data.getStatus());
            stmt.setInt(11, data.getIsActive());
            stmt.setInt(12, data.getIsDeleted());
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Paciente añadido correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void update(int Id, Patient data) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("UPDATE Roles SET CityId = ?, StateId = ?, FirstName = ?, LastName = ?, Age = ?, DUI = ?, SocialNumber = ?, NotableIllneses = ?, Gender = ?, Status = ?, IsActive = ?, IsDeleted = ? WHERE Id = ?;");
            stmt.setInt(1, data.getCityId());
            stmt.setInt(2, data.getStateId());
            stmt.setString(3, data.getFirstName());
            stmt.setString(4, data.getLastName());
            stmt.setInt(5, data.getAge());
            stmt.setString(6, data.getDUI());
            stmt.setString(7, data.getSocialNumber());
            stmt.setInt(8, data.getNotableIllneses());
            stmt.setInt(9, data.getGender());
            stmt.setInt(10, data.getStatus());
            stmt.setInt(11, data.getIsActive());
            stmt.setInt(12, data.getIsDeleted());
            stmt.setInt(13, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Paciente actualizado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void delete(int Id) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection con = db.getConn()) {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Patients WHERE Id = ?;");
            stmt.setInt(1, Id);
            int operation = stmt.executeUpdate();
            con.close();
            System.out.println("Paciente eliminado correctamente! " + operation + " registros afectados.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
