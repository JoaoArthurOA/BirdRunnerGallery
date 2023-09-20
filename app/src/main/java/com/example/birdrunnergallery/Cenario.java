package com.example.birdrunnergallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cenario extends AppCompatActivity {

    Button btnasset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenario);

    btnasset = findViewById(R.id.btnasset);
        btnasset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Uri web = Uri.parse("https://assetstore.unity.com/packages/2d/environments/warped-city-assets-pack-138128");
            Intent it = new Intent(Intent.ACTION_VIEW, web);
            startActivity(it);
        }
    });
}
        }