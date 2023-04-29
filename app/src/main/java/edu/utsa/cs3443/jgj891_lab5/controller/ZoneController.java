package edu.utsa.cs3443.jgj891_lab5.controller;

import android.content.Intent;
import android.view.View;

import java.io.IOException;

import edu.utsa.cs3443.jgj891_lab5.DinoActivity;
import edu.utsa.cs3443.jgj891_lab5.MainActivity;
import edu.utsa.cs3443.jgj891_lab5.ZoneActivity;
import edu.utsa.cs3443.jgj891_lab5.model.Park;
import edu.utsa.cs3443.jgj891_lab5.model.Zone;

/**
 * The ZoneController class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
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
        relocateIntent.putExtra("ZONE", zoneActivity.getZone());
        zoneActivity.startActivity(relocateIntent);
    }

    /**
     * Sets the zoneActivity
     * @param zoneActivity
     */
    private void setZoneActivity(ZoneActivity zoneActivity){
        this.zoneActivity = zoneActivity;
    }

    /**
     * Sets the mainActivity
     * @param mainActivity
     */
    private void setMainActivity(MainActivity mainActivity){this.mainActivity = mainActivity;}

    /**
     * sets the read
     * @param read
     */
    private void setRead(boolean read){this.read = read;}

    /**
     * Sets the park
     *
     * @param mainActivity
     * @throws IOException
     */
    private void setPark(MainActivity mainActivity) throws IOException {this.park = new Park("Jurassic Park", mainActivity);}

    /**
     *
     * @return zoneActivity
     */
    public ZoneActivity getZoneActivity(){
        return(this.zoneActivity);
    }

    /**
     *
     * @return mainActivity
     */
    public MainActivity getMainActivity(){return (this.mainActivity);}

    /**
     *
     * @return read
     */
    public boolean getRead(){return(this.read);}

    /**
     *
     * @return park
     */
    public Park getPark(){return (this.park);}
}
