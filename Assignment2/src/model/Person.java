/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asawari
 */
public class Person {
    
    private String firstname;
    private String lastname;
    private int personage;
    private String personcityname;
    private String personcommunityname;
    private int personhouseno;
    private String personHospitalName;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPersonage() {
        return personage;
    }

    public void setPersonage(int personage) {
        this.personage = personage;
    }

    public String getPersoncityname() {
        return personcityname;
    }

    public void setPersoncityname(String personcityname) {
        this.personcityname = personcityname;
    }

    public String getPersoncommunityname() {
        return personcommunityname;
    }

    public void setPersoncommunityname(String personcommunityname) {
        this.personcommunityname = personcommunityname;
    }

    public int getPersonhouseno() {
        return personhouseno;
    }

    public void setPersonhouseno(int personhouseno) {
        this.personhouseno = personhouseno;
    }

    public String getPersonHospitalName() {
        return personHospitalName;
    }

    public void setPersonHospitalName(String personHospitalName) {
        this.personHospitalName = personHospitalName;
    }
    
    

    @Override
    public String toString() {
        return firstname;
    }
    
    
}
