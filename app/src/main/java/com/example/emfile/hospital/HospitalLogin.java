package com.example.emfile.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emfile.R;

public class HospitalLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_login);
    }

    public void hospitalHome(View view) {
        Intent intent=new Intent(HospitalLogin.this,HospitalHome.class);
        startActivity(intent);
    }

    public void hospitalRegister(View view) {
        Intent intent = new Intent(HospitalLogin.this,HospitalRegister.class);
        startActivity(intent);
    }
}