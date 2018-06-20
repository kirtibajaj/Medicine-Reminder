package com.example.mypc.ep;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by MYPC on 3/2/2018.
 */

public class NotificationFragment extends Fragment {
    String[] notify={"Medicine Time:","Exercise Time:","Appointment:"};
    String[] notify1={"You have to take 2 pills in morning","you have to exercise as schedule","Hey you to go for check up today"};
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notificationfragment, container,
                false);
      LVAdapter1 adapter=new LVAdapter1(getActivity(),notify,notify1);
        ListView l=(ListView)rootView.findViewById(R.id.listview_notify);
        l.setAdapter(adapter);

        return rootView;}
}
