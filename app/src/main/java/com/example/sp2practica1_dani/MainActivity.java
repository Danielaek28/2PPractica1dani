package com.example.sp2practica1_dani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.menuopcion);
        btn2 = (Button) findViewById(R.id.menucontextual);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en menu opcion", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), Menuopciones.class);
                startActivity(i);
            }

        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hiciste click en menu contextual ", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), Menucontextual.class);
                startActivity(i);
            }

        });
    }
}

