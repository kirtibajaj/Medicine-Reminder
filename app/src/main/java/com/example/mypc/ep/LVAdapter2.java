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

public class LVAdapter2 extends BaseAdapter {
    Context context;
    String[] Medicine;
    String[] dose;
    String[] Timing;
    LayoutInflater inflater;

    public LVAdapter2(Context context, String[] Medicine1, String[] dose1,String[] Timing1) {
        this.context = context;
        this.Medicine = Medicine1;
        this.dose=dose1;
        this.Timing=Timing1;

    }
    public int getCount() {
        return Medicine.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

    TextView Medicine1;
    TextView Dose1;
    TextView Timing1;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.item_layout_medicine, parent, false);
        Medicine1= (TextView) itemView.findViewById(R.id.medicine_name);
        Dose1=(TextView)itemView.findViewById(R.id.dose1);
        Timing1=(TextView)itemView.findViewById(R.id.timing1);
        Medicine1.setText(Medicine[position]);
        Dose1.setText(dose[position]);
        Timing1.setText(Timing[position]);
        return itemView;
    }
}
