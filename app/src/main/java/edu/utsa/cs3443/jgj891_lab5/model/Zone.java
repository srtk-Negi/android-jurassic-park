package edu.utsa.cs3443.jgj891_lab5.model;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;

public class Zone {



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
