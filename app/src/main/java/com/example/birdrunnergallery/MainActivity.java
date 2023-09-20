package com.example.birdrunnergallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnacessar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnacessar = (Button) findViewById(R.id.btnacessar);

        btnacessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent centro = new Intent(getApplicationContext(), CentroGaleria.class);
                startActivity(centro);
            }

        });
    }
}