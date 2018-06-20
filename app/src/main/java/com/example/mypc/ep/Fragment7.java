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

public class Fragment7 extends Fragment {

    public Fragment7(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment7, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t8);
        t1.setText("To increase strength in the abdominal muscles\n" +
                "\n" +
                "Take a deep breath and tighten your abdominal muscles.\n" +
                "Hold for 3 breaths and then release the contraction.\n" +
                "Repeat 10 times.");
        return rootView;
}}
