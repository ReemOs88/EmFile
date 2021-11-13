package com.example.emfile.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emfile.R;

public class PatientLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
    }

    public void patientLogin(View view) {
        Intent myIntent = new Intent(PatientLogin.this, PatientHome.class);

        startActivity(myIntent);
    }

    public void patientRegister(View view) {
        Intent myIntent = new Intent(PatientLogin.this, PatientRegister.class);

        startActivity(myIntent);
    }
}