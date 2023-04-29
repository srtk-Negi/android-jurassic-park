package edu.utsa.cs3443.jgj891_lab5.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;
/**
 * The zone class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Zone {
    private String zoneName;
    private int humanCount;
    private ArrayList<Dinosaur> dinoList;
    public Zone(String zoneName, int humanCount){
        this.setZoneName(zoneName);
        this.setHumanCount(humanCount);
        this.setDinoList();
    }

    /**
     *
     * @param zoneName
     */
    private void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     *
     * @param humanCount
     */
    private void setHumanCount(int humanCount){
        this.humanCount = humanCount;
    }

    /**
     * Initializes a new Arraylist of dinosaurs
     */
    private void setDinoList(){
        this.dinoList = new ArrayList<>();
    }

    /**
     *
     * @return zone name
     */
    public String getZoneName(){
        return this.zoneName;
    }

    /**
     *
     * @return number of humans in a zone
     */
    public int getHumanCount(){
        return this.humanCount;
    }
    public ArrayList<Dinosaur> getDinoList(){
        return this.dinoList;
    }

    /**
     *
     * @return string representation of the Zone
     */
    public String toString() {
        String ret = "Zone Name: " + this.getZoneName()+"\n";
        for(int i=0; i < dinoList.size();i++){
            ret = ret.concat(dinoList.get(i).toString()+"\n");
        }
        return ret;
    }
}
