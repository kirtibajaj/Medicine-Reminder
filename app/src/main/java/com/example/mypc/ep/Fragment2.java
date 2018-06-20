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

public class Fragment2 extends Fragment {

    public Fragment2(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t3);
        t1.setText("Stand with your feet hip-width apart and your weight evenly distributed on both feet.\n" +
                "Relax your hands at your sides. You can also do this exercise with a sturdy chair in front of you in case you need to grab it for balance.\n" +
                "Shift your weight on to your right side, then lift your left foot a few inches off of the floor.\n" +
                "Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "Return to the starting position and repeat with the opposite leg.\n" +
                "Repeat 3 times.\n"+"Stand with your feet hip-width apart, with your hands on your hips or on the back of a sturdy chair if you need support.\n" +
                "Lift your left foot off of the floor, bending at the knee and lifting your heel halfway between the floor and your buttocks.\n" +
                "Hold for 10 seconds, eventually working up to 30 seconds.\n" +
                "Return to the starting position and repeat with the opposite leg.\n" +
                "Repeat 3 times"
               );
        return rootView;
}}
