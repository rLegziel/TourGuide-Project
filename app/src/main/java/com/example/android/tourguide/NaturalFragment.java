package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;


public class NaturalFragment extends Fragment {

    public NaturalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.landmark_list, container, false);

        final ArrayList<Landmark> landmarks = new ArrayList<Landmark>();
        landmarks.add(new Landmark(R.string.deadName,R.string.deadLocation, R.drawable.deadsea));
        landmarks.add(new Landmark(R.string.seaName,R.string.seaLocation, R.drawable.kineret));
        landmarks.add(new Landmark(R.string.ramonName,R.string.ramonLocation, R.drawable.ramoncrater));
        landmarks.add(new Landmark(R.string.roshName,R.string.roshInfo, R.drawable.roshhanikra));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

