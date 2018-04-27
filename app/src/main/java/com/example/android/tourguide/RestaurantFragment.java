package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.landmark_list, container, false);

        final ArrayList<Landmark> landmarks = new ArrayList<Landmark>();
        landmarks.add(new Landmark(R.string.machneName,R.string.machneInfo));
        landmarks.add(new Landmark(R.string.abuName,R.string.abuInfo));
        landmarks.add(new Landmark(R.string.taizuName,R.string.taizuInfo));
        landmarks.add(new Landmark(R.string.meatName,R.string.meatInfo));
        landmarks.add(new Landmark(R.string.oldManName, R.string.oldManInfo));

        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}