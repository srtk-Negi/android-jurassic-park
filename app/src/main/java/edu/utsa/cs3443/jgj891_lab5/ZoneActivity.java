package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.jgj891_lab5.controller.ZoneController;

public class ZoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ZoneController zoneController = new ZoneController(this);
        setContentView(R.layout.activity_zone);

        Button relocateADinoBtn = findViewById(R.id.relocate_a_dino_btn);

        relocateADinoBtn.setOnClickListener(zoneController);
    }
}