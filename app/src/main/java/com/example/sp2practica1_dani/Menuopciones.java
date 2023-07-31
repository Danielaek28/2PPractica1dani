package com.example.sp2practica1_dani;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Menuopciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuopciones);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        int id = item.getItemId();
        if(id==R.id.opc1)
            Toast.makeText(getApplicationContext(),"presionaste menu contextual",Toast.LENGTH_LONG).show();
        Intent i = new Intent(getApplicationContext(), Menucontextual.class);
        startActivity(i);

        if(id==R.id.opc2)
            Toast.makeText(getApplicationContext(),"presionaste menu popup",Toast.LENGTH_LONG).show();
        Intent in = new Intent(getApplicationContext(), Menuopciones.class);
        startActivity(in);

        if(id==R.id.opc3)
            Toast.makeText(getApplicationContext(),"presionaste regresar a inicio",Toast.LENGTH_LONG).show();
        Intent in1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in1);

        if(id==R.id.opc4)
            Toast.makeText(getApplicationContext(),"presionaste salir",Toast.LENGTH_LONG).show();

        if(id==R.id.Busqueda1)
            Toast.makeText(getApplicationContext(),"presionaste Busqueda",Toast.LENGTH_LONG).show();

    return super.onOptionsItemSelected(item);
    }
}
