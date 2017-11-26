package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

import static com.example.android.tourguide.R.id.food;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foo = new Intent(getApplicationContext(),Food.class);
                startActivity(foo);
            }
        });
        TextView places = (TextView) findViewById(R.id.places);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent place = new Intent(getApplicationContext(),Places.class);
                startActivity(place);
            }
        });
        TextView shop = (TextView)findViewById(R.id.Shop);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shop = new Intent(getApplicationContext(),Shop.class);
                startActivity(shop);
            }
        });
        TextView map = (TextView)findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH,"geo:30.3467846,76.3390131?z=11");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        TextView edu = (TextView)findViewById(R.id.education);
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edu = new Intent(getApplicationContext(),Education.class);
                startActivity(edu);
            }
        });

    }
}
