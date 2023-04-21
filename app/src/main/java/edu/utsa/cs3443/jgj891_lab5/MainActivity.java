package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.utsa.cs3443.jgj891_lab5.controller.MainController;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainController mainController = new MainController(this);

        Button btn_x = findViewById(R.id.x_button);
        Button btn_g = findViewById(R.id.g_button);
        Button btn_d = findViewById(R.id.d_button);
        Button btn_r = findViewById(R.id.r_button);
        Button btn_b = findViewById(R.id.b_button);
        Button btn_tr = findViewById(R.id.tr_button);
        Button btn_ty = findViewById(R.id.ty_button);

        btn_x.setOnClickListener(mainController);
        btn_b.setOnClickListener(mainController);
        btn_g.setOnClickListener(mainController);
        btn_d.setOnClickListener(mainController);
        btn_r.setOnClickListener(mainController);
        btn_tr.setOnClickListener(mainController);
        btn_ty.setOnClickListener(mainController);
    }
}