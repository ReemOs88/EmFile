package com.example.emfile.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.emfile.R;

public class BookDoctorAppointment extends AppCompatActivity {
    String[] hospitalItems={"Suliman Al_Habib Hospital","Saudi German Hospital","Hayat Hospital"};
    String[] doctorListItems={"dr.Mohammed Hassan","dr.Zeinab Gamal","dr.Ibrahim Ali"};
    String[] specializationItems={"Surgery","Dermatology","Gynaecology"};
    AutoCompleteTextView autoCompleteHospitalTv;
    ArrayAdapter<String> adapterHospitalItems;
    AutoCompleteTextView autoCompleteDoctorTv;
    ArrayAdapter<String> adapterDoctorItems;
    AutoCompleteTextView autoCompleteSpecializationTv;
    ArrayAdapter adapterSpecializationItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_doctor_appointment);
        autoCompleteHospitalTv =findViewById(R.id.autoComplete_hospital_name);
        adapterHospitalItems = new ArrayAdapter<>(this, R.layout.hospital_list_item, hospitalItems);
        autoCompleteHospitalTv.setAdapter(adapterHospitalItems);
        autoCompleteHospitalTv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= parent.getItemAtPosition(position).toString();
                Toast.makeText(BookDoctorAppointment.this, "Item:"+item, Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteDoctorTv=findViewById(R.id.autoComplete_doctor_name);
        adapterDoctorItems= new ArrayAdapter<>(this, R.layout.doctor_list_items, doctorListItems);
        autoCompleteDoctorTv.setAdapter(adapterDoctorItems);
        autoCompleteDoctorTv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(BookDoctorAppointment.this, "Item:"+item, Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteSpecializationTv =findViewById(R.id.autoComplete_specialization);
        adapterSpecializationItems= new ArrayAdapter<>(this,R.layout.specialization_list_item,specializationItems);
        autoCompleteSpecializationTv.setAdapter(adapterSpecializationItems);
        autoCompleteSpecializationTv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(BookDoctorAppointment.this, "Item:"+item, Toast.LENGTH_SHORT).show();
            }
        });



    }

    public void book(View view) {
        Intent myIntent = new Intent(BookDoctorAppointment.this, PatientHome.class);

        startActivity(myIntent);
    }
}