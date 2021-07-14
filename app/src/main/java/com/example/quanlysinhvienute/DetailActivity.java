package com.example.quanlysinhvienute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    TextView tenmon, giamon;
    ImageView hinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
            tenmon=(TextView)findViewById(R.id.tenmon);
            giamon=(TextView)findViewById(R.id.giamon);
            hinh=(ImageView)findViewById(R.id.Hinh);
            String ten=getIntent().getStringExtra("ten");
            String gia=getIntent().getStringExtra("gia");
            tenmon.setText(ten);
            giamon.setText(gia);
            hinh.setImageResource(R.drawable.img1);
    }
    public void onBackClick(View view){
        startActivity(new Intent(this,ListActivity.class));

}
    public void MuaNgay(View view){
        Toast.makeText(getApplicationContext(),"Mua thành công",Toast.LENGTH_SHORT).show();
    }
}