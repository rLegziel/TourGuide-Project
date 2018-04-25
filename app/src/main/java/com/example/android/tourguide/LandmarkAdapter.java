package com.example.android.tourguide;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by roix on 4/25/18.
 */

public class LandmarkAdapter extends ArrayAdapter<Landmark> {

    public LandmarkAdapter(Context context, ArrayList<Landmark> landmarks) {
        super(context, 0, landmarks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.info_layout, parent, false);
        }

        Landmark currentWord = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // put the name on the currentWord
        nameTextView.setText(currentWord.getName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
        // put the info on the currentWord
        infoTextView.setText(currentWord.getName());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;


    }


}
