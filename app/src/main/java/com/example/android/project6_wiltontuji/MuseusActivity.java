package com.example.android.project6_wiltontuji;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museus);

        ArrayList<Lista> array = new ArrayList<Lista>();

        array.add(new Lista("Museu 1", "Avaliação: ?/5", "Horário: 10h as 18h", R.drawable.mus_1));
        array.add(new Lista("Museu 2", "Avaliação: ?/5", "Horário: 10h as 18h", R.drawable.mus_2));
        array.add(new Lista("Museu 3", "Avaliação: ?/5", "Horário: 10h as 18h", R.drawable.mus_3));

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
