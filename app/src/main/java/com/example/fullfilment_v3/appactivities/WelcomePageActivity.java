package com.example.fullfilment_v3.appactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.signin.SignInActivity;

public class WelcomePageActivity extends AppCompatActivity {

    Button btnStartApplication;
    Button btnSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        btnSignOut = findViewById(R.id.btnSignOut);
        btnStartApplication = findViewById(R.id.btnStart);

        btnStartApplication.setOnClickListener(view -> {

        });

        btnSignOut.setOnClickListener(view -> {
            finish();
            startActivity(new Intent(WelcomePageActivity.this, SignInActivity.class));
        });
    }
}