/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PredatorDev
 */
public class DatabaseConnection {
    public Connection getConn() {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://chinoexpress.cuozftziuxql.us-east-1.rds.amazonaws.com:3306/marstech","marstechuser","password");
        } catch (ClassNotFoundException | SQLException e) {
            con = null;
            System.out.println(e);
        }
        return con;
    }
}
