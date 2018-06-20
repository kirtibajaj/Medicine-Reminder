package com.example.mypc.ep;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by MYPC on 3/16/2018.
 */

public class Medicine_Fragment extends android.support.v4.app.Fragment{
    String[] Medicine={"Memantine:alzihmer","Budesonide:Asthma","Insulin aspart:Diabetes","Buprenoephine:Pain"};
    String[] Dose= new String[]{"1", "2" ,"1","3"};
    String[] Timing={"night","morning/evening","night","anytime"};
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.medicine_layout, container,
                false);
        LVAdapter2 adapter=new LVAdapter2(getActivity(),Medicine,Dose,Timing);
        ListView l=(ListView)rootView.findViewById(R.id.medicine_listview);
        l.setAdapter(adapter);


        return rootView;
    }


}
