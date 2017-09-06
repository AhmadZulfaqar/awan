package com.example.akarumbi.myintranetapps.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.akarumbi.myintranetapps.R;
import com.example.akarumbi.myintranetapps.fragmentnavdrawer.NavDrawer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_login;
    private TextView txtforgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button)findViewById(R.id.btn_login);
        txtforgotpassword = (TextView)findViewById(R.id.txtForgotPassword);
        txtforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,ForgotPassword.class);
                startActivity(in);
            }
        });

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent next = new Intent(MainActivity.this,NavDrawer.class);
        startActivity(next);
    }
}
