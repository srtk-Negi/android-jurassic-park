package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

import edu.utsa.cs3443.jgj891_lab5.controller.MainController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainController mainController = null;
        Intent intent = getIntent();
        boolean created = intent.getBooleanExtra("CREATED",false);
        System.out.println(created);
        if (created){
            try {
                mainController = new MainController(this,true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            try {
                mainController = new MainController(this,false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Button b = findViewById(R.id.b_button);
        Button g = findViewById(R.id.g_button);
        Button d = findViewById(R.id.d_button);
        Button r = findViewById(R.id.r_button);
        Button ty = findViewById(R.id.ty_button);
        Button tr = findViewById(R.id.tr_button);
        Button x = findViewById(R.id.x_button);

        b.setOnClickListener(mainController);
        g.setOnClickListener(mainController);
        d.setOnClickListener(mainController);
        r.setOnClickListener(mainController);
        ty.setOnClickListener(mainController);
        tr.setOnClickListener(mainController);
        x.setOnClickListener(mainController);
    }
}