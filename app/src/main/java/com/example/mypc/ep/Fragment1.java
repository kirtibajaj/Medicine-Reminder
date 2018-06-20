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

public class Fragment1 extends Fragment {

    public Fragment1(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        TextView t2=(TextView)rootView.findViewById(R.id.t2);
        t2.setText("To stretch the shoulders and back\n" +
                "\n" +
                "**Bend your right arm, raising it so your elbow is chest level and your right fist is near your left shoulder.\n" +
                "**Place your left hand on your right elbow and gently pull your right arm across your chest.\n" +
                "**Hold for 20 to 30 seconds.\n" +
                "**Repeat with the opposite arm");
        return rootView;
}}
