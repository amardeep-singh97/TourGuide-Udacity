package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.drawable.shop_one,R.string.shop_one,R.string.shop_name_one));
        data.add(new Data(R.drawable.shop_two,R.string.shop_two,R.string.shop_name_two));
        data.add(new Data(R.drawable.shop_three,R.string.shop_three,R.string.shop_name_three));
        DataAdapter adapter=new DataAdapter(this,data);
        ListView listView = (ListView) findViewById(R.id.shop);
        listView.setAdapter(adapter);
    }
}
