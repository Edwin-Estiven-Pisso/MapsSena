package com.edwin.mapssena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnHibrido , btnSatelital, btnNormal, btnTerranio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        referenciar();
    }
    private void referenciar(){
        btnHibrido = findViewById(R.id.btnHibrido);
        btnSatelital = findViewById(R.id.btnSatelital);
        btnNormal = findViewById(R.id.btnNormal);
        btnTerranio = findViewById(R.id.btnTerranio);


        btnHibrido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(Menu.this,MapaHibrido.class);
                startActivity(Intent);
            }
        });
        btnSatelital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(Menu.this,MapaSatelital.class);
                startActivity(Intent);
            }
        });
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent Intent = new Intent (Menu.this,MapaNormal.class);
               startActivity(Intent);
            }
        });
        btnTerranio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(Menu.this,MapaTerranio.class);
                startActivity(Intent);
            }
        });
    }
}