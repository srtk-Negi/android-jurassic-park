package edu.utsa.cs3443.jgj891_lab5.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;

public class Zone {
    private String zoneName;
    private int humanCount;
    private static HashMap<String,Zone> dinoList= new HashMap<>();

    public Zone(String zoneName, int humanCount, MainActivity mainActivity) throws IOException {
        this.setZoneName(zoneName);
        this.setHumanCount(humanCount);
        this.loadDinos(mainActivity);
    }

    public void loadDinos(MainActivity mainActivity) throws IOException {
        AssetManager am = mainActivity.getAssets();
        InputStream zoneStream = am.open("zones.csv");
        InputStream dinoStream = am.open("dinos.csv");
        InputStream typesStream = am.open("types.csv");


    }


    void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    void setHumanCount(int humanCount){
        this.humanCount = humanCount;
    }


    String getZoneName(){
        return this.zoneName;
    }

    int getHumanCount(){
        return this.humanCount;
    }
}
