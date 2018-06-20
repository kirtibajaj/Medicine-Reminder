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

public class Fragment6 extends Fragment {

    public Fragment6(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment6, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t7);
        t1.setText("To strengthen and stretch muscles in the lower back\n" +
                "\n" +
                "Take a deep breath, tighten your buttocks, and tilt your hips slightly forward.\n" +
                "Hold for a 3-count.\n" +
                "Now tilt your hips back, and hold for 3 seconds. (It’s a very subtle movement.)\n" +
                "Repeat 8 to 12 times");
        return rootView;
}}
