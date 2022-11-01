/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author asawari
 */
public class Encounter {
    
    private int encounterno;
    private int encpatientid;
    private ArrayList<VitalSign> vitalSignList;

    public int getEncpatientid() {
        return encpatientid;
    }

    public void setEncpatientid(int encpatientid) {
        this.encpatientid = encpatientid;
    }
    
    public Encounter(){
    vitalSignList = new ArrayList<>();
    }

    public int getEncounterno() {
        return encounterno;
    }

    public void setEncounterno(int encounterno) {
        this.encounterno = encounterno;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public void addVitalSign(VitalSign vitalSign){
    this.vitalSignList.add(vitalSign);
            }
    
}
