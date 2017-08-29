package com.example.akarumbi.myintranetapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyLeavesNext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_leaves_next);

        Button btnleavetype = (Button)findViewById(R.id.btn_leavetype);
        btnleavetype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MyLeavesNext.this,ExpandableMyLeaves.class);
                startActivity(in);
            }
        });
    }
}