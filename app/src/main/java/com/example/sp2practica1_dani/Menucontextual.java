package com.example.sp2practica1_dani;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menucontextual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucontextual);
        Button buttonContextMenu =(Button) findViewById(R.id.buttonContextMenu);
        registerForContextMenu(buttonContextMenu);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucontextual, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.op1)
            Toast.makeText(getApplicationContext(),"presionaste menu de opciones",Toast.LENGTH_LONG).show();
        if(id==R.id.op2)
            Toast.makeText(getApplicationContext(),"presionaste menu popup",Toast.LENGTH_LONG).show();
        if(id==R.id.op3)
            Toast.makeText(getApplicationContext(),"presionaste regresar a inicio",Toast.LENGTH_LONG).show();
        if(id==R.id.op4)
            Toast.makeText(getApplicationContext(),"presionaste salir ",Toast.LENGTH_LONG).show();


        return super.onOptionsItemSelected(item);
    }
}
