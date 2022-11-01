/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asawari
 */
public class Patient {
    private int patientid;
    private String patientfirstname;
    private String patientlastname;
    private int patientage;
    private String patientcommunity;
    private String patienthospital;
    private String patientcity;
    private int patienthouse;
    

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientfirstname() {
        return patientfirstname;
    }

    public void setPatientfirstname(String patientfirstname) {
        this.patientfirstname = patientfirstname;
    }

    public String getPatientlastname() {
        return patientlastname;
    }

    public void setPatientlastname(String patientlastname) {
        this.patientlastname = patientlastname;
    }

    public int getPatientage() {
        return patientage;
    }

    public void setPatientage(int patientage) {
        this.patientage = patientage;
    }

    public String getPatientcommunity() {
        return patientcommunity;
    }

    public void setPatientcommunity(String patientcommunity) {
        this.patientcommunity = patientcommunity;
    }

    public String getPatienthospital() {
        return patienthospital;
    }

    public void setPatienthospital(String patienthospital) {
        this.patienthospital = patienthospital;
    }
    
    

    public String getPatientcity() {
        return patientcity;
    }

    public void setPatientcity(String patientcity) {
        this.patientcity = patientcity;
    }

    public int getPatienthouse() {
        return patienthouse;
    }

    public void setPatienthouse(int patienthouse) {
        this.patienthouse = patienthouse;
    }

    @Override
    public String toString() {
        return String.valueOf(patientid);
    }
    
    
}
