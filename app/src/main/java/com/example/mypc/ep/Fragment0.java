package com.example.mypc.ep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MYPC on 3/3/2018.
 */

public class Fragment0 extends android.support.v4.app.Fragment {

    public Fragment0(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment0, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t1);
        t1.setText("To relieve tension in the neck and upper back\n" +
                "**Stand with your feet flat on the floor, shoulder-width apart. Keep your hands relaxed at your sides.\n" +
                "**Don’t tip your head forward or backward as you turn your head slowly to the right. Stop when you feel a slight stretch. Hold for 10 to 30 seconds.\n"
                +"**Now turn to the left. Hold for 10 to 30 seconds.\n" +
                        "**Repeat 3 to 5 times." );
        return rootView;
}}
