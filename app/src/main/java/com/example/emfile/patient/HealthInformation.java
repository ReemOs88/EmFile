package com.example.emfile.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emfile.R;

public class HealthInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_information);
    }

    public void patientHome(View view) {
        Intent myIntent = new Intent(HealthInformation.this, PatientHome.class);

        startActivity(myIntent);
    }
}