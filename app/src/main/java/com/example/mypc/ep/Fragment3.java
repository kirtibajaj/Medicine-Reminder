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

public class Fragment3 extends Fragment {

    public Fragment3(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);
        TextView t1=(TextView)rootView.findViewById(R.id.t4);
        t1.setText("Balance boosters\n" +
                "Since accidental falls are a significant source of injury \nfor many older adults, incorporating balance exercises in your\n exercise regimen is essential. Doing balance \nexercises, such as the ones described here, \nor an activity such as tai chi or yoga,\n makes it easier to walk on uneven surfaces\n without losing balance. You can\n do these balance exercises every day,\n several times a day — even when you’re standing\n in line at the bank or the grocery store.");
        return rootView;
}}
