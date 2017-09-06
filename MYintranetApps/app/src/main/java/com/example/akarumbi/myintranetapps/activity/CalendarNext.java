package com.example.akarumbi.myintranetapps.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.akarumbi.myintranetapps.R;

public class CalendarNext extends AppCompatActivity {

    Button btn_calendar_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_next);

        btn_calendar_back = (Button)findViewById(R.id.btn_calendar_back);
        btn_calendar_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               CalendarNext.this.finish();
            }
        });
    }
}
