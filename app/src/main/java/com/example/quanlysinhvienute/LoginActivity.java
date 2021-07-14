package com.example.quanlysinhvienute;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity {
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button btnDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnDangnhap = findViewById(R.id.btnDangnhap);
        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getIntent();
                String dl_mail=i.getStringExtra("mail").trim();
                String dl_pass=i.getStringExtra("pass").trim();
                String txt_mail = editTextEmail.getText().toString().trim();
                String txt_pass=editTextPassword.getText().toString().trim();
                if(txt_mail.isEmpty() || txt_pass.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Không được để trống",Toast.LENGTH_SHORT).show();
                }
                else {
                    if((txt_pass.equals(dl_pass)) && (txt_mail.equals(dl_mail))){
                        Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent listItem=new Intent( LoginActivity.this, ListActivity.class);
                        startActivity(listItem);
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Mật khẩu sai",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

}