package com.example.adaptors;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adaptorJAVA extends BaseAdapter {
     private Context context;
     private String[] items;

    public adaptorJAVA(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView== null){

            convertView= LayoutInflater.from(context)
                    .inflate(R.layout.adaptor,parent,false);

            holder = new ViewHolder();
            holder.textview = convertView.findViewById(R.id.text);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.textview.setText(items[position]);


        return convertView ;
    }

    static class ViewHolder{
        TextView textview;
    }
}
