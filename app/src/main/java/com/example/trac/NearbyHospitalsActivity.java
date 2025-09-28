package com.example.trac;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trac.HospitalDetailsActivity;
import com.example.trac.R;

import java.util.ArrayList;
import java.util.HashMap;

public class NearbyHospitalsActivity extends AppCompatActivity {

    private ListView hospitalsListView;
    private ArrayList<String> hospitalsList;
    private HashMap<String, String[]> hospitalDetailsMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_hospitals);

        hospitalsListView = findViewById(R.id.hospitalsListView);

        Intent intent = getIntent();
        double latitude = intent.getDoubleExtra("latitude", 0.0);
        double longitude = intent.getDoubleExtra("longitude", 0.0);

        if (latitude != 0.0 && longitude != 0.0) {
            hospitalsList = new ArrayList<>();
            hospitalsList.add("Shifa Hospitals");
            hospitalsList.add("Rosemary Mission Hospitals");
            hospitalsList.add("Sugham Health Center");
            hospitalsList.add("Aruna Cardiac Care");
            hospitalsList.add("Kauvery Hospital");
            hospitalsList.add("Galaxy Hospitals");
            hospitalsList.add("Lakshmi Madhavan Hospital");
            hospitalsList.add("Ponra Multispeciality Hospital");
            hospitalsList.add("Royal Hospital");
            hospitalsList.add("Krishna Hospital");
            hospitalsList.add("Govt. Superspeciality Hospital");
            hospitalsList.add("Jayakumar Hospital");
            hospitalsList.add("CSI Jayaraj Annapackiam Mission Hospital");

            hospitalDetailsMap = new HashMap<>();
            hospitalDetailsMap.put("Shifa Hospital", new String[]{"Shifa Hospital", "82, Near Junction Flyover, Tirunelveli Junction, Tirunelveli, Tamil Nadu 627001", "09442139292", "Cardiology, Dental Services, General Surgery, Maternity care", "Open 24 hours", "Dr. M. Mohamed Arafath MD., General Medicine", "Dr. S. Murugan MD, DV.,  Dermatology&sexology","Dr. S. Ganapathy MS.,  ENT"});
            hospitalDetailsMap.put("Rosemary Mission Hospitals", new String[]{"Rosemary Mission Hospitals", "10/3, S Bypass Road, Vannarpettai, Tirunelveli, Tamil Nadu 627009", "0462 250 2211", "Cardiology,Neruology, Accident and Trauma", "open 24 hours", "Dr. Badshah Cardiologists ,Dr. Shekar K Orthopaedic"});
            hospitalDetailsMap.put("Sugham Health Center", new String[]{"Sugham Health Center", "17-E, Perumal South Car st, Tirunelveli Town, Tamil Nadu 627001", "0462 233 4411", "General Care, Cardiology", "Open 24 hours", "Dr. Sujatha, M.D., OG., Gynaecologist"});
            hospitalDetailsMap.put("Aruna Cardiac Care", new String[]{"Aruna Cardiac Care", "3B, Trivandrum Road, Kailash Nagar, Vannarpettai, Tirunelveli, Tamil Nadu 627003", "09342961454", "Emergency Care, X-ray and radiology services, Ambulance service, MRIs, Medical imaging, Sport injuries", "Open 24 hours", "Dr. Arunachalam E Cardiologists"});
            hospitalDetailsMap.put("Kauvery Hospital", new String[]{"Kauvery Hospital", "110E, 20/1, N Byepass Road, Vannarpettai, Tirunelveli, Tamil Nadu 627003", "0462 400 6000", "Laboratory Services, Surgery, General Care", "Open 24 hours", "Dr. S. Senthil Babu (Neuro Surgery), Dr. M.J. Felix Cordelia (Plastic Surgery), Dr. K.S. Ashoke Prakaash (General Surgery),Dr. M.J. Muralilannan (Surgical oncology),Dr. S. Vidya (General Medicine)"});
            hospitalDetailsMap.put("Galaxy Hospitals", new String[]{"Galaxy Hospitals", "110E, 20/1, N Byepass Road, Vannarpettai, Tirunelveli, Tamil Nadu 627003", "0462 250 1951", "Arthroscopy, Total Hip Replacement, Surgery, General Care", "Open 24 hours", "Dr. Sheetal Kumar Gupta (Orthopedic Surgeon), Dr. Emma (General Practitioner)"});
            hospitalDetailsMap.put("Lakshmi Madhavan Hospital", new String[]{"Lakshmi Madhavan Hospital", "S Byepass Road, Vannarpettai, Tirunelveli, Tamil Nadu 627002", "0462 251 0600", "Emergency care, Orthopaedics, Obstetrics and Gynaecology", "Open 24 hours", "Dr. M. Madhubala (Obstetrics and Gynaecology), Dr. Nandita A Thakkar (Visiting Consultants), Dr. M. Manickavasagam (Peadiatrics), Dr. A.V. Gokul (Urology)"});
            hospitalDetailsMap.put("Ponra Multispeciality Hospital", new String[]{"Ponra Multispeciality Hospital", "66G, 3, Trivandrum Road, Vasanth Nagar, Tirunelveli, Tamil Nadu 627005", "0462 297 0100", "Cardiology, Orthopedics, Gynecology, Pediatrics, Neurology, Urology", "Open 24 hours", "Dr. C. Ponraj (Urologist), Dr. Ganeshan (Cardiologist), Dr. Selva Kumar (Cardiologist), Dr. Thomas Edwinraj (neurologist), Dr. Senthil Arasu (Pulmonologist)"});
            hospitalDetailsMap.put("Royal Hospital", new String[]{"Royal Hospital", "2nd Sharon Street, Kamarajar Road, Vasantha Nagar, Tirunelveli, Tamil Nadu 627007", "09952154237", "Neonatal Care, Pediatric, Fetal Medicine, Obstetric Care, Child Care, Medicine and Genetics, Infertility", "Open 24 hours", "Dr. Syed Ibrahim (Peadiatrics), Dr. Mohamed Razeen (Surgeon)"});
            hospitalDetailsMap.put("Krishna Hospital", new String[]{"Krishna Hospital", "N0 4,5 Grpund Road, Palayamkottai, Tirunelveli 627002", "7947430081", "Diseases in Pregnancy, Cardiologist Consultation", "Open 24 hours", "Dr. S. Raju (Pediatrics), Dr. Raj Mohan (General Surgery), Dr.Alagesan (Neurology), Dr.Ramaguru (Orthopedic), Dr. Venkata Saravanan (Pediatric Surgery)"});


            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, hospitalsList);
            hospitalsListView.setAdapter(adapter);

            hospitalsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                    String hospitalName = hospitalsList.get(position);
                    String[] hospitalDetails = hospitalDetailsMap.get(hospitalName);

                    Intent intent = new Intent(NearbyHospitalsActivity.this, HospitalDetailsActivity.class);
                    intent.putExtra("name", hospitalDetails[0]);
                    intent.putExtra("address", hospitalDetails[1]);
                    intent.putExtra("contact", hospitalDetails[2]);
                    intent.putExtra("services", hospitalDetails[3]);
                    intent.putExtra("status", hospitalDetails[4]);
                    intent.putExtra("doctors", hospitalDetails[5]);
                    startActivity(intent);
                }
            });
        } else {
            Toast.makeText(this, "Location data is missing.", Toast.LENGTH_SHORT).show();
        }
    }
}
