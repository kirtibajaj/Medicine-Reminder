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

public class Fragment4 extends Fragment {

    public Fragment4(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment4, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t5);
        t1.setText("To strengthen the calves\n" +
                "\n" +
                "Seated in a chair, lift your right foot off the floor and slowly rotate your foot 5 times to the right and then 5 times to the left.\n" +
                "Repeat with the left foot.");
        return rootView;
}}
