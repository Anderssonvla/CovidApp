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
public class HospitalDischarge {
    private int Id;
    private int PatientId;
    private int HospitalId;
    private int IsActive;
    private int IsDeleted;

    public HospitalDischarge(int Id, int PatientId, int HospitalId, int IsActive, int IsDeleted) {
        this.Id = Id;
        this.PatientId = PatientId;
        this.HospitalId = HospitalId;
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

    public int getHospitalId() {
        return HospitalId;
    }

    public void setHospitalId(int HospitalId) {
        this.HospitalId = HospitalId;
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
