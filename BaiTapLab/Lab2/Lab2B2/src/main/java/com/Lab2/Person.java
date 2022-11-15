/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author LeMinh
 */
public class Person {
    private String Staffid;
    private String Fullname;
    private String Country;
    private String Gender;
    private boolean Status;
    private String Notes;

    public Person() {
    }

    public Person(String Staffid, String Fullname, String Country, String Gender, boolean Status, String Notes) {
        this.Staffid = Staffid;
        this.Fullname = Fullname;
        this.Country = Country;
        this.Gender = Gender;
        this.Status = Status;
        this.Notes = Notes;
    }

    public String getStaffid() {
        return Staffid;
    }

    public void setStaffid(String Staffid) {
        this.Staffid = Staffid;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    
}
