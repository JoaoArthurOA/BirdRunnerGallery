package com.example.birdrunnergallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CentroGaleria extends AppCompatActivity {
    Button btnpersonagem;
    Button btnsair;
    Button btncenario;
    Button btnmusicas;

    Button btncreditos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_galeria);

        btnsair = (Button)findViewById(R.id.btnsair);

        btnsair.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view) {
              finish();
              System.exit(0);
          }
        });

        btnpersonagem = (Button)findViewById(R.id.btnperso);
        btnpersonagem.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick (View view){
             Intent personagem = new Intent(getApplicationContext(),Personagem.class);
             startActivity(personagem);
           }
        });

        btncenario = (Button)findViewById(R.id.btncenario);
        btncenario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent cenario = new Intent(getApplicationContext(),Cenario.class);
                startActivity(cenario);
            }
        });

        btnmusicas = (Button)findViewById(R.id.btnmusicas);
        btnmusicas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent musica = new Intent(getApplicationContext(), Musicas.class);
                startActivity(musica);
            }
        });

        btncreditos = (Button)findViewById(R.id.btncreditos);
        btncreditos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent creditos = new Intent(getApplicationContext(), Creditos.class);
                startActivity(creditos);
            }
        });
    }
}
