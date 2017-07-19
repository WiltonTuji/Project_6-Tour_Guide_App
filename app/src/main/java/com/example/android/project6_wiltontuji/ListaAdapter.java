package com.example.android.project6_wiltontuji;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adailto on 18/04/2017.
 */

public class ListaAdapter extends ArrayAdapter<Lista> {

    public ListaAdapter(Context context, ArrayList<Lista> lista) {
        super(context, 0, lista);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Lista lista = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_lista, parent, false);
        }
        TextView tvNome = (TextView) convertView.findViewById(R.id.nome_text_view);
        TextView tvDesc1 = (TextView) convertView.findViewById(R.id.desc1_text_view);
        TextView tvDesc2 = (TextView) convertView.findViewById(R.id.desc2_text_view);
        ImageView ivFoto = (ImageView) convertView.findViewById(R.id.foto_image_view);

        tvNome.setText(lista.getNome());
        tvDesc1.setText(lista.getDesc1());
        tvDesc2.setText(lista.getDesc2());
        ivFoto.setImageResource(lista.getFotoID());

        return convertView;
    }
}