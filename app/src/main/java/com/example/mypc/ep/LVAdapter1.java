package com.example.mypc.ep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by MYPC on 2/5/2018.
 */

public class LVAdapter1 extends BaseAdapter {
    Context context;
    String[] notify;
    String[] notify2;
    LayoutInflater inflater;

    public LVAdapter1(Context context, String[] name,String[] notify2) {
        this.context = context;
        this.notify = name;
        this.notify2=notify2;

    }
    public int getCount() {
        return notify.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

    TextView notify1;
    TextView notify21;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.layout_item_notification, parent, false);
        notify1 = (TextView) itemView.findViewById(R.id.Notify);
        notify21=(TextView)itemView.findViewById(R.id.Notify2);
        notify1.setText(notify[position]);
        notify21.setText(notify2[position]);
        return itemView;
    }
}
