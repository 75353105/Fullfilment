package com.example.fullfilment_v3.appactivities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

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
            finish();
            startActivity(new Intent(WelcomePageActivity.this, HomeDashboardActivity.class));
        });

        btnSignOut.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(WelcomePageActivity.this)
                    .setTitle("Confirmare delogare")
                    .setMessage("Sunteți sigur că vreți să ieșiți din cont?")
                    .setNegativeButton("NU", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    })
                    .setPositiveButton("DA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            startActivity(new Intent(WelcomePageActivity.this, SignInActivity.class));
                            dialogInterface.cancel();
                        }
                    }).create();

            dialog.show();
        });
    }
}