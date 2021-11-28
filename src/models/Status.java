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
public class Status {
    private int Id;
    private String Name;
    private String Description;
    private String TableName;
    private String Field;

    public Status(int Id, String Name, String Description, String TableName, String Field) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.TableName = TableName;
        this.Field = Field;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public String getField() {
        return Field;
    }

    public void setField(String Field) {
        this.Field = Field;
    }
}
