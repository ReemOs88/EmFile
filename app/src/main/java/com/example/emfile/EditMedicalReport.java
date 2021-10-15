package com.example.emfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditMedicalReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_medical_report);

    }

    public void editDone(View view) {
        Intent myIntent = new Intent(EditMedicalReport.this, PatientHome.class);
        startActivity(myIntent);
    }
}