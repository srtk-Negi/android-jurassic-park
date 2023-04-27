package edu.utsa.cs3443.jgj891_lab5.controller;

import android.content.Intent;
import android.view.View;

import java.io.IOException;

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

    public ZoneController(MainActivity mainActivity, boolean read) throws IOException {
        this.setMainActivity(mainActivity);
        this.setRead(read);
        if(this.getRead() == false){
            this.setPark(this.getMainActivity());
        }
    }

    public ZoneController(ZoneActivity zoneActivity){
        this.setZoneActivity(zoneActivity);
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
    private void setMainActivity(MainActivity mainActivity){this.mainActivity = mainActivity;}
    private void setRead(boolean read){this.read = read;}
    private void setPark(MainActivity mainActivity) throws IOException {this.park = new Park("Jurassic Park", mainActivity);}
    public ZoneActivity getZoneActivity(){
        return(this.zoneActivity);
    }
    public MainActivity getMainActivity(){return (this.mainActivity);}
    public boolean getRead(){return(this.read);}
    public Park getPark(){return (this.park);}
}
