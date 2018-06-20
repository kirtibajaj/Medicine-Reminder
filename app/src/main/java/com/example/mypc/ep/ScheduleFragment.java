package com.example.mypc.ep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MYPC on 2/27/2018.
 */

public class ScheduleFragment extends android.support.v4.app.Fragment {
    public ScheduleFragment() {

    }

    Button b1,b2,b3,b4,b5,b6,b7;
    TextView t;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.schedulefragment, container,
                false);
        b1=(Button)rootView.findViewById(R.id.ex1);
        b2=(Button)rootView.findViewById(R.id.ex2);
        b3=(Button)rootView.findViewById(R.id.ex3);
        b4=(Button)rootView.findViewById(R.id.ex4);
        b5=(Button)rootView.findViewById(R.id.ex5);
        b6=(Button)rootView.findViewById(R.id.ex6);
        b7=(Button)rootView.findViewById(R.id.ex7);
        t=(TextView)rootView.findViewById(R.id.ex);
        //b1=(Button)findViewById(R.id.ex)
        // b1=(Button)findViewById(R.id.ex);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("15 minutes walk *2");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("15 minutes walk *2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("30 minutes cycling, swimming, Zumba, Water Aerobotics");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Rest");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("30 minutes walk");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("30 minutes Cycling, Swimming, Zumba, Water Aerobotics");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Rest");

            }
        });



        return rootView;
    }
}
