package com.example.mypc.ep;

import android.content.Intent;
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

public class HomeFragment extends android.support.v4.app.Fragment {
    public HomeFragment() {

    }
    Button button ;

    Animation a, a1;
    TextView x, y;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.homefragment, container,
                false);
        x = (TextView) rootView.findViewById(R.id.textview);
        y = (TextView) rootView.findViewById(R.id.textview2);
        a1 = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.bounce);
        a = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.blink);
        x.setVisibility(View.VISIBLE);
        x.startAnimation(a1);
        x.startAnimation(a);

        button = (Button) rootView.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Scan_Activity.class));

            }
        });


        return rootView;
    }
}
