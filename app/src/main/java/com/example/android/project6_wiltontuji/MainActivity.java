package com.example.android.project6_wiltontuji;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout museusLL = (LinearLayout) findViewById(R.id.museus_linear_layout);
        LinearLayout restaurantesLL = (LinearLayout) findViewById(R.id.restaurantes_linear_layout);
        LinearLayout hoteisLL = (LinearLayout) findViewById(R.id.hoteis_linear_layout);
        LinearLayout vidanoturnaLL = (LinearLayout) findViewById(R.id.vidanoturna_linear_layout);

        museusLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museusLLIntent = new Intent(MainActivity.this, MuseusActivity.class);
                startActivity(museusLLIntent);
            }
        });

        restaurantesLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restarurantesLL = new Intent(MainActivity.this, RetaurantesActivity.class);
                startActivity(restarurantesLL);
            }
        });

        hoteisLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hoteisLLIntent = new Intent(MainActivity.this, HoteisActivity.class);
                startActivity(hoteisLLIntent);
            }
        });

        vidanoturnaLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vidanoturnaLLIntent = new Intent(MainActivity.this, VidaNoturnaActivity.class);
                startActivity(vidanoturnaLLIntent);
            }
        });

    }
}
