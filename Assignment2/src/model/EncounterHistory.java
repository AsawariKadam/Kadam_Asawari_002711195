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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistoryList;
    
    public EncounterHistory() {
        encounterHistoryList = new ArrayList<>();
    }


    public ArrayList<Encounter> getEncounterHistoryList() {
        return encounterHistoryList;
    }

    public void setEncounterHistoryList(ArrayList<Encounter> encounterHistoryList) {
        this.encounterHistoryList = encounterHistoryList;
    }
    
    public void addEncounterInList(Encounter encounter){
        encounterHistoryList.add(encounter);
    }
    
}
