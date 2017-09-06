package com.example.akarumbi.myintranetapps.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import com.example.akarumbi.myintranetapps.R;

public class ApplyTimesheet extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView theDate;

    String [] Project={"E-Aduan" , "Firefly (R&D)" , "Firefly Corporate Website" , "Firefly Corporate Website" , "Firefly Non-Billable (Kiosk,SMS, Mobile, Enrich)" ,
                           "Firefly T&M Billable (Skysales, Intranet, Extranet, FLIRT)" , "Internal Tasks (Intern - Altriz)" , "Internal Tasks (Intern - ME-Tech" ,
                           "Internal Tasks (Technical)" , "NIDA Rooms GST/VAT Tax Invoice System" , "RSOG Website & Intranet Maintenance Only" , "TBD (R&D)" ,
                           "TBD Corp Website" , "TBD Mobile App" , "TBD Web Redemption" } ;

    String [] Task={ "Administrative Tasks" , " Annual Leave" , "Attend Training (External)" , "Attend Training (Internal)" , "Break time, solat and staff recreation." ,
            "Client Meeting (Outside)" , "Company Event/Gathering" , "Company meeting" , "Conduct training & preparation" , "Emergency Leave" ,"Enter & approve timesheet" ,
            "Friday prayers" , " Internal system/product development & enhancement and support" , "Maternity Leave" , "Medical Leave"};

    String [] Status= {"Pending" , "Submitted"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_timesheet);

        ArrayAdapter<String > arrayAdapter1= new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Project);
        MaterialBetterSpinner betterSpinner1 = (MaterialBetterSpinner) findViewById(R.id.Project);
        betterSpinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String > arrayAdapter2= new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Task);
        MaterialBetterSpinner betterSpinner2 = (MaterialBetterSpinner) findViewById(R.id.Task);
        betterSpinner2.setAdapter(arrayAdapter2);

        ArrayAdapter<String > arrayAdapter3= new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,Status);
        MaterialBetterSpinner betterSpinner3 = (MaterialBetterSpinner) findViewById(R.id.Status);
        betterSpinner3.setAdapter(arrayAdapter3);



    }
}
