package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.landmark_list, container, false);

        final ArrayList<Landmark> landmarks = new ArrayList<Landmark>();
        landmarks.add(new Landmark(R.string.massadaName,R.string.massadaInfo, R.drawable.masada));
        landmarks.add(new Landmark(R.string.westernWall,R.string.westernInfo, R.drawable.westernwall));
        landmarks.add(new Landmark(R.string.rockDome, R.string.rockDomeInfo, R.drawable.rockdome));
        landmarks.add(new Landmark(R.string.church,R.string.churchInfo, R.drawable.churchoftheholy));


        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
