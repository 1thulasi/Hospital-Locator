package com.example.trac;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HospitalDetailsActivity extends AppCompatActivity {

    private TextView hospitalNameTextView, hospitalAddressTextView, hospitalContactTextView,
            hospitalServicesTextView, hospitalStatusTextView, hospitalDoctorsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);

        hospitalNameTextView = findViewById(R.id.hospitalName);
        hospitalAddressTextView = findViewById(R.id.hospitalAddress);
        hospitalContactTextView = findViewById(R.id.hospitalContact);
        hospitalServicesTextView = findViewById(R.id.hospitalServices);
        hospitalStatusTextView = findViewById(R.id.hospitalStatus);
        hospitalDoctorsTextView = findViewById(R.id.hospitalDoctors);

        Intent intent = getIntent();
        String hospitalName = intent.getStringExtra("name");
        String hospitalAddress = intent.getStringExtra("address");
        String hospitalContact = intent.getStringExtra("contact");
        String hospitalServices = intent.getStringExtra("services");
        String hospitalStatus = intent.getStringExtra("status");
        String hospitalDoctors = intent.getStringExtra("doctors");

        hospitalNameTextView.setText("Name: " + hospitalName);
        hospitalAddressTextView.setText("Address: " + hospitalAddress);
        hospitalContactTextView.setText("Contact: " + hospitalContact);
        hospitalServicesTextView.setText("Available Services: " + hospitalServices);
        hospitalStatusTextView.setText("Open Status: " + hospitalStatus);
        hospitalDoctorsTextView.setText("Specialist Doctors: " + hospitalDoctors);
    }
}
