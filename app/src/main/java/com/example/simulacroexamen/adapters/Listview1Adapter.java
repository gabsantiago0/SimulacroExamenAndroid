package com.example.simulacroexamen.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.simulacroexamen.R;
import com.example.simulacroexamen.clases.Telefono;

import java.util.ArrayList;

public class Listview1Adapter extends ArrayAdapter<Telefono> {
    private Context context;
    private ArrayList<Telefono> telefonos;

    public Listview1Adapter(Context context, ArrayList<Telefono> telefonos) {
        super(context, 0, telefonos);
        this.context = context;
        this.telefonos = telefonos;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.contactos_list, parent, false);
        }

        TextView idNum = convertView.findViewById(R.id.textViewIdTlftextViewIdTlf);
        TextView num = convertView.findViewById(R.id.textViewTlf);
        ImageView imagen = convertView.findViewById(R.id.imageViewTlf);

        Telefono telefono = telefonos.get(position);

        idNum.setText(String.valueOf(telefono.getId()));
        num.setText(telefono.getTelefono());
        imagen.setImageResource(R.drawable.call); //El icono lo he metido en casa, en clase habia puesto uno random

        return convertView;
    }


}
