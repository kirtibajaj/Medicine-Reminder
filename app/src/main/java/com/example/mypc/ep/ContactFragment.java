package com.example.mypc.ep;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MYPC on 3/2/2018.
 */

public class ContactFragment extends Fragment {
    String[] Name = {"Family", "Doctor", "Medical Store", "Grocer", "Therapist"};
    String[] Number = {"9950159150", "1234567890", "987654321", "987654321", "9950159150"};
    ImageButton img1;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_contact, container,
                false);
        LVAdapter adapter = new LVAdapter(getActivity(), Name, Number);
        ListView l = (ListView) rootView.findViewById(R.id.listview_contact);
        img1 = (ImageButton) rootView.findViewById(R.id.call);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent in = new Intent(Intent.ACTION_DIAL);
                in.setData(Uri.parse("tel:9950159150"));
                startActivity(in);

            }
        });


        return rootView;

    }

}
