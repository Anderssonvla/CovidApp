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
public class DoseApplication {
    public int Id;
    public int PatientId;
    public int VaccineId;
    public int DoseNumber;
    public int IsActive;
    public int IsDeleted;
    
    public DoseApplication(int Id, int PatientId, int VaccineId, int DoseNumber, int IsActive, int IsDeleted) {
        this.Id = Id;
        this.PatientId = PatientId;
        this.VaccineId = VaccineId;
        this.DoseNumber = DoseNumber;
        this.IsActive = IsActive;
        this.IsDeleted = IsDeleted;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public int getVaccineId() {
        return VaccineId;
    }

    public void setVaccineId(int VaccineId) {
        this.VaccineId = VaccineId;
    }

    public int getDoseNumber() {
        return DoseNumber;
    }

    public void setDoseNumber(int DoseNumber) {
        this.DoseNumber = DoseNumber;
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
