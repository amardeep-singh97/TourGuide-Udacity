package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Amardeep on 7/13/2017.
 */

public class DataAdapter extends ArrayAdapter<Data> {
    public DataAdapter(Activity context, ArrayList<Data> data) {
        super(context, 0, data);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_view, parent, false);
        }
        Data currentdata = getItem(position);
        ImageView image = (ImageView)listItemView.findViewById(R.id.info_image);
        image.setImageResource(currentdata.getImageResource());
        TextView text = (TextView)listItemView.findViewById(R.id.info_text);
        text.setText(currentdata.getAboutResource());
        TextView name = (TextView)listItemView.findViewById(R.id.info_name);
        name.setText(currentdata.getNameResource());
        return listItemView;
    }
}
