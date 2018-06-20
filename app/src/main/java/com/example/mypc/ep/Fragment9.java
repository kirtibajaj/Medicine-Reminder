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

public class Fragment9 extends Fragment {

    public Fragment9(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment9, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t10);
        t1.setText("To increase strength in the chest and shoulders\n" +
                "\n" +
                "Stand about 3 feet away from a wall, facing the wall, with your feet shoulder-width apart.\n" +
                "Lean forward and place your hands flat on the wall, in line with your shoulders. Your body should be in plank position, with your spine straight, not sagging or arched.\n" +
                "Lower your body toward the wall and then push back.\n" +
                "Repeat 10 times");
        return rootView;
}}
