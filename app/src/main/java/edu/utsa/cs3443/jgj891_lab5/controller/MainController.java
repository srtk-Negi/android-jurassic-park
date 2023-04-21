package edu.utsa.cs3443.jgj891_lab5.controller;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;
import edu.utsa.cs3443.jgj891_lab5.ZoneActivity;

public class MainController implements View.OnClickListener {
    private MainActivity mainActivity;
    public MainController(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public void onClick(View view){
        Intent moveToZoneActivityIntent = new Intent(mainActivity, ZoneActivity.class);
        System.out.println(view.getId());
        mainActivity.startActivity(moveToZoneActivityIntent);
    }

}
