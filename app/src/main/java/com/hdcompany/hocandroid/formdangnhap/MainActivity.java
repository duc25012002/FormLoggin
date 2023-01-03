package com.hdcompany.hocandroid.formdangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAccept;
    EditText edtEmail, edtPassword;
    String email = "ductrieuhoang@gmail.com";
    String password = "duc25012002";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        xuLySuKien();
    }

    private void anhXa() {
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnAccept = (Button) findViewById(R.id.btnAccept);
    }

    public void xuLySuKien() {
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtEmail.getText().toString())) {
                    edtEmail.setError("Email not null");
                }

                if (TextUtils.isEmpty(edtPassword.getText().toString())) {
                    edtPassword.setError("Password not null");
                }

                if (edtEmail.getText().toString().trim().equalsIgnoreCase(email) && edtPassword.getText().toString().trim().equalsIgnoreCase(password)) {

                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainScreen.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}