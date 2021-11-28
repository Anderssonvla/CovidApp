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
public class Hospital {
    private int Id;
    private String Name;
    private int IntUnitCares;
    private int IsActive;
    private int IsDeleted;

    public Hospital(int Id, String Name, int IntUnitCares, int IsActive, int IsDeleted) {
        this.Id = Id;
        this.Name = Name;
        this.IntUnitCares = IntUnitCares;
        this.IsActive = IsActive;
        this.IsDeleted = IsDeleted;
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

    public int getIntUnitCares() {
        return IntUnitCares;
    }

    public void setIntUnitCares(int IntUnitCares) {
        this.IntUnitCares = IntUnitCares;
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
