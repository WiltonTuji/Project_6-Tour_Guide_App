package com.example.android.project6_wiltontuji;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class VidaNoturnaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vida_noturna);

        ArrayList<Lista> array = new ArrayList<Lista>();

        array.add(new Lista("Atividade 1", "Balada", "Horário: 22h as 06h", R.drawable.party));
        array.add(new Lista("Atividade 2", "Bar", "Horário: 18h as 02h", R.drawable.beer));
        array.add(new Lista("Atividade 3", "Restaurante com vista da cidade", "Horário: 18h as 23h", R.drawable.waiter));

        ListaAdapter adapter = new ListaAdapter(this, array);
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
    }
}
