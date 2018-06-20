package com.example.mypc.ep;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by MYPC on 2/12/2018.
 */

public class ImageViewAdapter extends BaseAdapter {
    private Context mcontext;
    public ImageViewAdapter(Context c){
        mcontext=c;
    }
    public int getCount(){
        return mthumbids.length;

    }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;

    }
    public View getView(int position, View convertview, ViewGroup parent){
        ImageView imageView;
        if(convertview==null){
            imageView=new ImageView(mcontext);
        }
        else{
            imageView=(ImageView)convertview;
        }
        imageView.setImageResource(mthumbids[position]);
        return imageView;
    }
    public Integer[] mthumbids={};

}
