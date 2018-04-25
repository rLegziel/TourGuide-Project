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
        landmarks.add(new Landmark("Madison Square Garden", "Ha-Menofim St 5, Herzliya, Israel \n+972 54-738-8838"));
        landmarks.add(new Landmark("Imperial Cocktail Bar", "HaYarkon St 66, Tel Aviv-Yafo, Israel \n+972 73-264-9464"));
        landmarks.add(new Landmark("Social Club", "Rothschild Blvd 45, Tel Aviv-Yafo, Israel \n+972 3-560-1114"));
        landmarks.add(new Landmark("Syncopa Bar", "Khayat St 5, Haifa, Israel \n+972 54-614-2643"));
        landmarks.add(new Landmark("BeerBazaar", "Etz Hayyim St 3, Jerusalem, Israel \n+972 2-671-2559"));

        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}
