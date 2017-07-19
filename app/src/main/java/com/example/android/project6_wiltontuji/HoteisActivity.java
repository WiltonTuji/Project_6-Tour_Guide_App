package com.example.android.project6_wiltontuji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HoteisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteis);

        ArrayList<Lista> array = new ArrayList<Lista>();

        array.add(new Lista("Hotel 1", "Avaliação: ?/5", "Preço: ?/5", R.drawable.hotel_1));
        array.add(new Lista("Hotel 2", "Avaliação: ?/5", "Preço: ?/5", R.drawable.hotel_2));
        array.add(new Lista("Hotel 3", "Avaliação: ?/5", "Preço: ?/5", R.drawable.hotel_3));

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
