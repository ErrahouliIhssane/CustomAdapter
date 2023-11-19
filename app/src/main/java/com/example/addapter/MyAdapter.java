package com.example.addapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    ArrayList data;
    Context context;
    public MyAdapter(ArrayList data, Context context){
        this.data=data;
        this.context=context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;}

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View v = convertview;
        if(v==null){
            v= LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null);
            TextView tv = v.findViewById(android.R.id.text1);
            tv.setText(data.get(position).toString());
        }
        return v;
    }
}
