package com.example.emfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookDoctorAppointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_doctor_appointment);
    }

    public void book(View view) {
        Intent myIntent = new Intent(BookDoctorAppointment.this, PatientHome.class);

        startActivity(myIntent);
    }
}