package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button buClose;
    TextView name;
    TextView passWd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buClose = findViewById(R.id.bu_close);
        name = (TextView) findViewById(R.id.textViewName);
        passWd = (TextView) findViewById(R.id.textViewPassW);

        String userName = getIntent().getStringExtra("userName");
        String passW = getIntent().getStringExtra("passW");

        name.setText(userName);
        passWd.setText(passW);

        buClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO : RESET INPUTS
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}