package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.utsa.cs3443.jgj891_lab5.controller.DinoController;
/**
 * The DinoActivity class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class DinoActivity extends AppCompatActivity {
    EditText dinoName;
    EditText zone;
    TextView currentZone;
    String zoneName;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino);
        DinoController dinoController = new DinoController(this);
        dinoName = findViewById(R.id.name_input);
        zone = findViewById(R.id.zone_input);
        Button relocate = findViewById(R.id.relocate_btn);
        Button map = findViewById(R.id.park_map_btn);

        relocate.setOnClickListener(dinoController);
        map.setOnClickListener(dinoController);

        currentZone = findViewById(R.id.zone_name);
        Intent intent = getIntent();
        String zone = intent.getStringExtra("ZONE");
        currentZone.setText(getString(R.string.zone_name,zone));
        zoneName = intent.getStringExtra("ZONE");

    }

    /**
     *
     * @return name of the dinosaur
     */
    public String getName(){
        return dinoName.getText().toString();
    }

    /**
     *
     * @return zone
     */
    public String getZone(){
        return zone.getText().toString();
    }

    /**
     *
     * @return zoneName
     */
    public String getCalledZone(){
        return zoneName;
    }

}