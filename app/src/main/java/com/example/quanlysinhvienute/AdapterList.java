package com.example.quanlysinhvienute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterList extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Detail> arraylist;

    public AdapterList(Context context, int layout, List<Detail> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);
        Detail detail = arraylist.get(position);
        TextView textv1 =convertView.findViewById(R.id.name);
        TextView textv2 =convertView.findViewById(R.id.mota);
        TextView textv3 =convertView.findViewById(R.id.gia);
        ImageView imageView = convertView.findViewById(R.id.imageHinh);
        textv1.setText(detail.getTenmon());
        textv2.setText(detail.getChitiet());
        textv3.setText(detail.getGia());
        imageView.setImageResource(detail.hinh);
        return convertView;
    }
}
