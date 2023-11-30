package com.example.simulacroexamen;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simulacroexamen.adapters.Listview1Adapter;
import com.example.simulacroexamen.clases.Telefono;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Telefono>telefonos = new ArrayList<>();

        Telefono tlf1 = new Telefono(1,"48598483534");
        Telefono tlf2 = new Telefono(2,"35433463353");
        Telefono tlf3 = new Telefono(3,"121341414341");
        Telefono tlf4 = new Telefono(4,"224542526657");

        telefonos.add(tlf1);
        telefonos.add(tlf2);
        telefonos.add(tlf3);
        telefonos.add(tlf4);

        ListView listaMain = findViewById(R.id.ListViewMain);
        Listview1Adapter adapter = new Listview1Adapter(this,telefonos);
        listaMain.setAdapter(adapter);














    }
}