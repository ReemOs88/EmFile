package com.example.emfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emfile.hospital.HospitalLogin;
import com.example.emfile.patient.PatientLogin;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void hospital(View view) {
            Intent intent=new Intent(MainActivity.this, HospitalLogin.class);
            startActivity(intent);
    }

    public void patient(View view) {
        Intent myIntent = new Intent(MainActivity.this, PatientLogin.class);

        startActivity(myIntent);
    }


}