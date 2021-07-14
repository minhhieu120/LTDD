package com.example.quanlysinhvienute;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextName,editTextEmail,editTextMobile,editTextPassword;
    Button btnDangky;
    ArrayList<Account> arrayList;
    String txtName,txtPass,txtPhone,txtMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        changeStatusBarColor();
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextMobile = findViewById(R.id.editTextMobile);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnDangky = findViewById(R.id.btnDangky);
        arrayList = new ArrayList<>();
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                String pass1=editTextPassword.getText().toString().trim();
                String pass2=editTextPassword.getText().toString().trim();
                if(pass1.equals(pass2)){
                    txtName = editTextName.getText().toString();
                    txtPass = editTextPassword.getText().toString().trim();
                    txtMail=editTextEmail.getText().toString();
                    txtPhone=editTextMobile.getText().toString();
                    Account ac1=new Account(txtName,txtPass,txtMail,txtPhone);
                    arrayList.add(ac1);
                    Toast.makeText(getApplicationContext(),"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(RegisterActivity.this,LoginActivity.class);
                    i.putExtra("mail",arrayList.get(arrayList.size()-1).email);
                    i.putExtra("pass",arrayList.get(arrayList.size()-1).pass);
                    startActivity(i);
                }
            }}
        );
    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }
    public void onLoginClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);
    }

}