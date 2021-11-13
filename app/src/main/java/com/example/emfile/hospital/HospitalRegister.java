package com.example.emfile.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.emfile.R;

public class HospitalRegister extends AppCompatActivity {
 String[] hospitalLocationItem={"Rihyadh", "Jeddah", "Dammam"};
 AutoCompleteTextView autoCompleteHospitalLocation;
 ArrayAdapter<String> adapterHospitalLocationItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_register);
        autoCompleteHospitalLocation= findViewById(R.id.autoComplete_hospital_location);
        adapterHospitalLocationItem = new ArrayAdapter<>(this,R.layout.hospital_location_list_item,hospitalLocationItem);
        autoCompleteHospitalLocation.setAdapter(adapterHospitalLocationItem);
        autoCompleteHospitalLocation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(HospitalRegister.this, "Item"+item, Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void hospitalHome(View view) {
        Intent intent = new Intent(HospitalRegister.this,HospitalHome.class);
        startActivity(intent);
    }
}