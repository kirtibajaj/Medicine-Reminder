package com.example.mypc.ep;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MYPC on 3/3/2018.
 */

public class Fragment8 extends Fragment {

    public Fragment8(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment8, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t9);
        t1.setText("To strengthen postural muscles and stretch the chest\n" +
                "\n" +
                "Sit up straight in your seat, rest your hands in your lap, and squeeze your shoulder blades toward one another.\n" +
                "Focus on keeping your shoulders down, not hunched up toward your ears, and hold for 3 seconds.\n" +
                "Release and repeat 8 to 12 times.");
        return rootView;
}}
