package edu.utsa.cs3443.jgj891_lab5.controller;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;
import edu.utsa.cs3443.jgj891_lab5.model.Zone;

public class ZoneController {
    private MainActivity mainActivity;
    private String zoneName;
    private Zone zone;

    public ZoneController(MainActivity mainActivity, String zoneName){
        this.setMainActivity(mainActivity);
        this.setZoneName(zoneName);
    }

    private void setMainActivity(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    private void setZoneName(String zoneName){
        this.zoneName = zoneName;
    }

    public MainActivity getMainActivity(){
        return(this.mainActivity);
    }
    public String getZoneName(){
        return(this.zoneName);
    }
}
