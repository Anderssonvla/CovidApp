/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidapp;

import java.sql.SQLException;
import screens.LoginScreen;



/**
 *
 * @author PredatorDev
 */
public class CovidApp{
    public static void main(String[] args) throws SQLException {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }
}
