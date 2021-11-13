package com.example.emfile.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emfile.R;

public class PatientRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_register);
    }


    public void continueRegistration(View view) {
        Intent myIntent = new Intent(PatientRegister.this, HealthInformation.class);

        startActivity(myIntent);
    }
}