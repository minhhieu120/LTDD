package com.example.quanlysinhvienute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    public String tenmon,gia,chitiet;
    public int hinh;
    ArrayList<Detail>arrayList;
    AdapterList adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView;


        listView=findViewById(R.id.listview);
        listView.setClickable(true);
        arrayList = new ArrayList<>();
        arrayList.add(new Detail("Trà sữa trân châu","Giá bán: 20.000VND","đã có trân châu",R.drawable.img1));
        arrayList.add(new Detail("Trà đào cam xả","Giá bán: 20.000VND","full topping",R.drawable.img2));
        arrayList.add(new Detail("Sữa tươi trân châu đường đen","Giá bán: 30.000VND","full topping",R.drawable.img3));
        arrayList.add(new Detail("Sữa chua đá","Giá bán: 20.000VND","full topping",R.drawable.img4));
        arrayList.add(new Detail("Trà sen vàng","Giá bán: 30.000VND","khong kem chesse",R.drawable.img5));
        adapter = new AdapterList(ListActivity.this,R.layout.layoutdanhsach,arrayList);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ShowItem(position);}});
    }
    private void ShowItem(int position){
        Detail c=arrayList.get(position);
        Intent i = new Intent( this, DetailActivity.class);
        i.putExtra("ten",c.getTenmon());
        i.putExtra("gia",c.getGia());
        i.putExtra("hinh",c.getHinh());
        startActivity(i);
    }
    public void onBackClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
}}