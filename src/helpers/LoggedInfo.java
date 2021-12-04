/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author PredatorDev
 */
public class LoggedInfo {
    private boolean SuccessAuth;
    private int RoleId;
    private String Username;
    private String FirstName;
    private String LastName;

    public LoggedInfo(boolean SuccessAuth, int RoleId, String Username, String FirstName, String LastName) {
        this.SuccessAuth = SuccessAuth;
        this.RoleId = RoleId;
        this.Username = Username;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    
    public boolean getSuccessAuth() {
        return SuccessAuth;
    }

    public void setSuccessAuth(boolean SuccessAuth) {
        this.SuccessAuth = SuccessAuth;
    }
    
    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    
}
