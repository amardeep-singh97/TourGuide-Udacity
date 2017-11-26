package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.drawable.places_one,R.string.places_one,R.string.place_name_one));
        data.add(new Data(R.drawable.places_two,R.string.places_two,R.string.place_name_two));
        data.add(new Data(R.drawable.places_three,R.string.places_three,R.string.place_name_three));
        data.add(new Data(R.drawable.places_four,R.string.places_four,R.string.place_name_four));
        DataAdapter adapter=new DataAdapter(this,data);
        ListView listView = (ListView) findViewById(R.id.places);
        listView.setAdapter(adapter);
    }
}
