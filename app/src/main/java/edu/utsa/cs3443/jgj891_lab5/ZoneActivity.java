package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import edu.utsa.cs3443.jgj891_lab5.controller.DinoController;
import edu.utsa.cs3443.jgj891_lab5.controller.ZoneController;

public class ZoneActivity extends AppCompatActivity {
    TextView guestNum,dinoNum,zone;
    TextView []nameViews = new TextView[10];
    TextView []infoViews = new TextView[10];

    int[] nameResources = {R.id.dinoName1,R.id.dinoName2,R.id.dinoName3,R.id.dinoName4,R.id.dinoName5,R.id.dinoName6,R.id.dinoName7,R.id.dinoName8,R.id.dinoName9,R.id.dinoName10};
    int[] infoResources = {R.id.dinoInfo1,R.id.dinoInfo2,R.id.dinoInfo3,R.id.dinoInfo4,R.id.dinoInfo5,R.id.dinoInfo6,R.id.dinoInfo7,R.id.dinoInfo8,R.id.dinoInfo9,R.id.dinoInfo10};
    int[] nameTextToDisplay = {R.string.dinoName1,R.string.dinoName2,R.string.dinoName3,R.string.dinoName4,R.string.dinoName5,R.string.dinoName6,R.string.dinoName7,R.string.dinoName8,R.string.dinoName9,R.string.dinoName10};
    int[] infoTextToDisplay = {R.string.dinoInfo1,R.string.dinoInfo2,R.string.dinoInfo3,R.string.dinoInfo4,R.string.dinoInfo5,R.string.dinoInfo6,R.string.dinoInfo7,R.string.dinoInfo8,R.string.dinoInfo9,R.string.dinoInfo10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);
        ZoneController zoneController;
        zoneController = new ZoneController(this);
        Button relocate = findViewById(R.id.button);
        relocate.setOnClickListener(zoneController);

        guestNum = findViewById(R.id.guests);


        dinoNum = findViewById(R.id.dinos);

        zone = findViewById(R.id.zone_name);

        Intent intent = getIntent();


        setInfoText(guestNum,R.string.human_count,intent.getStringExtra("GUESTNUM"));
        setInfoText(dinoNum,R.string.dino_count,intent.getStringExtra("DINONUM"));
        setInfoText(zone,R.string.zone_name,intent.getStringExtra("ZONE"));

        int length = intent.getIntExtra("SIZE",0);

        for(int i=0;i<length;i++){
            String []dino = intent.getStringArrayExtra("DINO".concat(Integer.toString(i+1)));
            System.out.println(dino[0]);
            nameViews[i] = findViewById(nameResources[i]);
            infoViews[i] = findViewById(infoResources[i]);
            setNameView(nameViews[i],nameTextToDisplay[i], dino[0]);
            setSpecifics(infoViews[i],infoTextToDisplay[i], dino[1],dino[2]);
        }

    }
    public void setInfoText(TextView textView,int ID, String zoneName){
        textView.setText(getString(ID,zoneName));
    }
    public void setNameView(TextView textView, int ID, String name){
        textView.setText(getString(ID,name));
    }
    public void setSpecifics(TextView textView, int ID, String type, String veg){
        textView.setText(getString(ID,type,veg));
    }
    public String getZone(){
        Intent intent = getIntent();
        return intent.getStringExtra("ZONE");
    }
}