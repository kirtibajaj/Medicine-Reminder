package com.example.mypc.ep;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MYPC on 2/5/2018.
 */

public class LVAdapter extends BaseAdapter{
    Context context;
    String[] name;
    String[] number;
    LayoutInflater inflater;

    public LVAdapter(Context context, String[] name, String[] number) {
        this.context = context;
        this.name = name;
        this.number = number;
    }
    public int getCount() {
        return name.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, final View convertView, ViewGroup parent) {

    TextView name1;
    TextView number1;
    String num ;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.layout_item_contact, parent, false);
        name1 = (TextView) itemView.findViewById(R.id.Designation);
        number1 = (TextView) itemView.findViewById(R.id.number);

        name1.setText(name[position]);
        number1.setText(number[position]);
        return itemView;
    }
}
