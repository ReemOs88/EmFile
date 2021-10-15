package com.example.emfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PatientHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);
    }

    public void medicalReport(View view) {
        Intent myIntent = new Intent(PatientHome.this, MedicalReport.class);

        startActivity(myIntent);
    }

    public void bookAppointment(View view) {
        Intent myIntent = new Intent(PatientHome.this, BookDoctorAppointment.class);

        startActivity(myIntent);
    }

    public void vaccination(View view) {
        Intent myIntent = new Intent(PatientHome.this, VaccinationDate.class);

        startActivity(myIntent);
    }
}