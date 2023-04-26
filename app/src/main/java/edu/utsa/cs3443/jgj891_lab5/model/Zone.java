package edu.utsa.cs3443.jgj891_lab5.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;

public class Zone {
    private String zoneName;
    private int humanCount;
    private ArrayList<Dinosaur> dinoList;
    public Zone(String zoneName, int humanCount){
        this.setZoneName(zoneName);
        this.setHumanCount(humanCount);
        this.dinoList = new ArrayList<>();
    }
    private void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    private void setHumanCount(int humanCount){
        this.humanCount = humanCount;
    }
    private void setDinoList(ArrayList<Dinosaur> dinoList){
        this.dinoList = dinoList;
    }
    public String getZoneName(){
        return this.zoneName;
    }
    public int getHumanCount(){
        return this.humanCount;
    }
    public ArrayList<Dinosaur> getDinoList(){
        return this.dinoList;
    }
    public String toString() {
        String ret = "Zone Name: " + this.getZoneName()+"\n";
        for(int i=0; i < dinoList.size();i++){
            ret = ret.concat(dinoList.get(i).toString()+"\n");
        }
        return ret;
    }
}
