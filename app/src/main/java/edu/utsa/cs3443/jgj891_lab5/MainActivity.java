package edu.utsa.cs3443.jgj891_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent moveToZoneActivityIntent = new Intent(MainActivity.this, ZoneActivity.class);

        Button btn_x = findViewById(R.id.x_button);
        Button btn_g = findViewById(R.id.g_button);
        Button btn_d = findViewById(R.id.d_button);
        Button btn_r = findViewById(R.id.r_button);
        Button btn_b = findViewById(R.id.b_button);
        Button btn_tr = findViewById(R.id.tr_button);
        Button btn_ty = findViewById(R.id.ty_button);

        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(moveToZoneActivityIntent);
            }
        });




    }
}