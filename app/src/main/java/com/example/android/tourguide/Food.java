package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.drawable.food_one,R.string.food_one,R.string.food_name_one));
        data.add(new Data(R.drawable.food_two,R.string.food_two,R.string.food_name_two));
        data.add(new Data(R.drawable.food_three,R.string.food_three,R.string.food_name_three));
        data.add(new Data(R.drawable.food_four,R.string.food_four,R.string.food_name_four));
        DataAdapter adapter=new DataAdapter(this,data);
        ListView listView = (ListView) findViewById(R.id.food);
        listView.setAdapter(adapter);
    }
}
