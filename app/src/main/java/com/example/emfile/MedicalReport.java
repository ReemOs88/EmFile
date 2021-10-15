package com.example.emfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicalReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_report);
    }

    public void editMedicalInfo(View view) {
        Intent myIntent = new Intent(MedicalReport.this, EditMedicalReport.class);
        startActivity(myIntent);
    }
}