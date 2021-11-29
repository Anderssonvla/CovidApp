/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidapp;

import controllers.RoleCnt;
import java.sql.SQLException;
import models.Role;


/**
 *
 * @author PredatorDev
 */
public class CovidApp {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        RoleCnt roleCnt = new RoleCnt();
        Role result = roleCnt.findOne(2);
        roleCnt.delete(5);
        System.out.println(result.getId());
        System.out.println(result.getName());
    }
}
