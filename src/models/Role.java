/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author PredatorDev
 */

public class Role {
    private int Id;
    private String Name;
    private Timestamp CreatedAt;
    private Timestamp UpdatedAt;

    public Role(int Id, String Name, Timestamp CreatedAt, Timestamp UpdatedAt) {
        this.Id = Id;
        this.Name = Name;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Timestamp getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Timestamp CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public Timestamp getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Timestamp UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
    
}
