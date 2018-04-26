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
        landmarks.add(new Landmark("Machneyuda", "Beit Ya'akov St 10, Jerusalem, Israel \n+972 2-533-3442"));
        landmarks.add(new Landmark("Abu Hassan", "1 Ha' Dolfin Street, Tel Aviv-Jaffa, Israel\n +972 3-682-0387"));
        landmarks.add(new Landmark("Taizu", "Ha-Sadna'ot St 4, Herzliya, Israel \n+972 9-954-6000"));
        landmarks.add(new Landmark("MeatBar", "Beit Ya'akov St 10, Jerusalem, Israel \n+972 2-533-3442"));
        landmarks.add(new Landmark("The Old Man and The Sea", "Retzif HaAliya HaShniya St 101, Tel Aviv-Yafo, Israel \n+972 3-544-8820"));

        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}