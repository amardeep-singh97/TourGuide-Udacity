package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Data> data = new ArrayList<Data>();
        data.add(new Data(R.drawable.education_one,R.string.education_one,R.string.education_name_one));
        data.add(new Data(R.drawable.education_two,R.string.education_two,R.string.education_name_two));
        data.add(new Data(R.drawable.education_three,R.string.education_three,R.string.education_name_three));
        DataAdapter adapter=new DataAdapter(this,data);
        ListView listView = (ListView) findViewById(R.id.edu);
        listView.setAdapter(adapter);
    }
}
