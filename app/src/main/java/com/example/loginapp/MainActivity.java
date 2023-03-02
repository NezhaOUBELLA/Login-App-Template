package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout user;
        final TextInputLayout pass;
        Button buLogin;

        user = (TextInputLayout) findViewById(R.id.textUser);
        pass = (TextInputLayout) findViewById(R.id.textPass);
        buLogin = findViewById(R.id.button_signUp);

        buLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                String userName = user.getEditText().getText().toString();
                String passW = pass.getEditText().getText().toString();
                i.putExtra("userName",userName);
                i.putExtra("passW",passW);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext(), "Application restart", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "Application fermée", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "Application ouverte", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "Application ouverte", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "Application en pause", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "Application stopée", Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }
}