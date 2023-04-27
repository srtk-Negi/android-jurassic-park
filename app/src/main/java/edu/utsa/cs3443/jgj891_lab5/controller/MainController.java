package edu.utsa.cs3443.jgj891_lab5.controller;

import static edu.utsa.cs3443.jgj891_lab5.model.Park.zones;

import android.content.Intent;
import android.view.View;

import java.io.IOException;
import edu.utsa.cs3443.jgj891_lab5.MainActivity;
import edu.utsa.cs3443.jgj891_lab5.ZoneActivity;
import edu.utsa.cs3443.jgj891_lab5.model.Dinosaur;
import edu.utsa.cs3443.jgj891_lab5.model.Zone;
import edu.utsa.cs3443.jgj891_lab5.R;

public class MainController implements View.OnClickListener{
    private MainActivity mainActivity;
    private ZoneController zoneController;
    private boolean readBefore;
    public MainController(MainActivity mainActivity,boolean readBefore) throws IOException {
        this.readBefore = readBefore;
        this.mainActivity = mainActivity;
        System.out.println("Constructed");
        this.zoneController = new ZoneController(mainActivity,readBefore);
    }
    @Override
    public void onClick(View view) {
        System.out.println("Called!");
        Intent intent = new Intent(mainActivity, ZoneActivity.class);
        String zoneName = determineZone(view.getId());
        Zone zone = zones.get(zoneName);
        intent.putExtra("GUESTNUM",Integer.toString(zone.getHumanCount()));
        intent.putExtra("DINONUM",Integer.toString(zone.getDinoList().size()));
        intent.putExtra("ZONE",zone.getZoneName());
        int length = Math.min(zone.getDinoList().size(),10);
        intent.putExtra("SIZE",length);
        for(int i=0;i<length;i++){
            Dinosaur dino = zone.getDinoList().get(i);
            System.out.println(dino);
            String veg = (dino.isVegetarian()) ? "vegetarian": "carnivore";
            intent.putExtra("DINO".concat(Integer.toString(i+1)),new String[]{dino.getName(), dino.getType(),veg});
        }
        mainActivity.startActivity(intent);
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public String determineZone(int ID){
        return (ID == R.id.tr_button) ? "TR": (ID == R.id.ty_button) ? "TY": (ID == R.id.r_button) ? "R": (ID == R.id.d_button) ? "D":(ID == R.id.b_button) ? "B":(ID == R.id.g_button) ? "G": "X";
    }

    public ZoneController getZoneController() {
        return zoneController;
    }

    public void setZoneController(ZoneController zoneController) {
        this.zoneController = zoneController;
    }

    public boolean isReadBefore() {
        return readBefore;
    }

    public void setReadBefore(boolean readBefore) {
        this.readBefore = readBefore;
    }
}
