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


public class BarsFragment extends Fragment {

    public BarsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.landmark_list, container, false);

        final ArrayList<Landmark> landmarks = new ArrayList<Landmark>();
        landmarks.add(new Landmark(R.string.madisonName, R.string.madisonInfo));
        landmarks.add(new Landmark(R.string.imperialName,R.string.imperialInfo));
        landmarks.add(new Landmark(R.string.socialName,R.string.socialInfo));
        landmarks.add(new Landmark(R.string.syncopaName, R.string.syncopaInfo));
        landmarks.add(new Landmark(R.string.beerName, R.string.beerInfo));

        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}
