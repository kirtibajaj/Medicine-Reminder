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

public class Fragment5 extends Fragment {

    public Fragment5(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment5, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t6);
        t1.setText("To relieve tension in the shoulders and upper back\n" +
                "\n" +
                "Sit in a firm chair. Place your feet flat on the floor, shoulder-width apart.\n" +
                "Hold your arms up and out in front at shoulder height, with your palms facing outward and the backs of your hands pressed together. Relax your shoulders so they’re not scrunched up near your ears.\n" +
                "Reach your fingertips out until you feel a stretch. Your back will move away from the back of the chair.\n" +
                "Stop and hold for 10 to 30 seconds.\n" +
                "Repeat 3 to 5 times.");
        return rootView;
}}
