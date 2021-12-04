/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PredatorDev
 */
public class User {
    private int Id;
    private int RoleId;
    private String FirstName;
    private String LastName;
    private String Username;
    private String Password;
    private int IsActive;
    private int IsDeleted;

    public User(int Id, int RoleId, String FirstName, String LastName, String Username, String Password, int IsActive, int IsDeleted) {
        this.Id = Id;
        this.RoleId = RoleId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Username = Username;
        this.Password = Password;
        this.IsActive = IsActive;
        this.IsDeleted = IsDeleted;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getIsActive() {
        return IsActive;
    }

    public void setIsActive(int IsActive) {
        this.IsActive = IsActive;
    }

    public int getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(int IsDeleted) {
        this.IsDeleted = IsDeleted;
    }
}
