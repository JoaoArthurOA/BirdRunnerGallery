package com.example.birdrunnergallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {

    Button web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);


web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Uri web = Uri.parse("https://youtube.com/@kauadaff?si=0TiyuaYMp3qcukMo");
        Intent it = new Intent(Intent.ACTION_VIEW, web);
        startActivity(it);
        }
        });
        }
        }