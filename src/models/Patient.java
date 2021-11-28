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
public class Patient {
    private int Id;
    private int CityId;
    private int StateId;
    private String FirstName;
    private String LastName;
    private int Age;
    private String DUI;
    private String SocialNumber;
    private int NotableIllneses;
    private int Gender;
    private int Status;
    private int IsActive;
    private int IsDeleted;

    public Patient(int Id, int CityId, int StateId, String FirstName, String LastName, int Age, String DUI, String SocialNumber, int NotableIllneses, int Gender, int Status, int IsActive, int IsDeleted) {
        this.Id = Id;
        this.CityId = CityId;
        this.StateId = StateId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.DUI = DUI;
        this.SocialNumber = SocialNumber;
        this.NotableIllneses = NotableIllneses;
        this.Gender = Gender;
        this.Status = Status;
        this.IsActive = IsActive;
        this.IsDeleted = IsDeleted;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int CityId) {
        this.CityId = CityId;
    }

    public int getStateId() {
        return StateId;
    }

    public void setStateId(int StateId) {
        this.StateId = StateId;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getSocialNumber() {
        return SocialNumber;
    }

    public void setSocialNumber(String SocialNumber) {
        this.SocialNumber = SocialNumber;
    }

    public int getNotableIllneses() {
        return NotableIllneses;
    }

    public void setNotableIllneses(int NotableIllneses) {
        this.NotableIllneses = NotableIllneses;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
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
