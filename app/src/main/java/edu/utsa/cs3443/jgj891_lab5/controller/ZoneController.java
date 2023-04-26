package edu.utsa.cs3443.jgj891_lab5.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.jgj891_lab5.DinoActivity;
import edu.utsa.cs3443.jgj891_lab5.MainActivity;
import edu.utsa.cs3443.jgj891_lab5.ZoneActivity;
import edu.utsa.cs3443.jgj891_lab5.model.Park;
import edu.utsa.cs3443.jgj891_lab5.model.Zone;

public class ZoneController implements View.OnClickListener {
    private Park park;
    private ZoneActivity zoneActivity;
    private MainActivity mainActivity;
    private boolean read;

    public ZoneController(MainActivity mainActivity, boolean read){

    }

    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        Intent relocateIntent = new Intent(this.getZoneActivity(), DinoActivity.class);
        zoneActivity.startActivity(relocateIntent);
    }

    private void setZoneActivity(ZoneActivity zoneActivity){
        this.zoneActivity = zoneActivity;
    }

    private void setZoneName(String zoneName){
        this.zoneName = zoneName;
    }

    public ZoneActivity getZoneActivity(){
        return(this.zoneActivity);
    }
    public String getZoneName(){
        return(this.zoneName);
    }
}
