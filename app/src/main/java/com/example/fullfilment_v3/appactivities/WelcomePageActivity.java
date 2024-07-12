package com.example.fullfilment_v3.appactivities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.signin.SignInActivity;

public class WelcomePageActivity extends AppCompatActivity {

    RelativeLayout background;
    Button btnStartApplication;
    Button btnSignOut;
    long userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        background = findViewById(R.id.layout_welcome);
        btnSignOut = findViewById(R.id.btnSignOut);
        btnStartApplication = findViewById(R.id.btnStart);
        initializeDefaultBackground();

        btnStartApplication.setOnClickListener(view -> {
            finish();
            startActivity(new Intent(WelcomePageActivity.this, HomeDashboardActivity.class));
        });

        btnSignOut.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(WelcomePageActivity.this)
                    .setTitle("Confirmation of the sign out")
                    .setMessage("Are you sure you want to sign out from the app?")
                    .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel())
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        resetBackgroundToDefault();
                        finish();
                        startActivity(new Intent(WelcomePageActivity.this, SignInActivity.class));
                        dialogInterface.cancel();
                    }).create();

            dialog.show();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        if(!settings.contains("background")) {
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("background", R.drawable.fundal_welcome_gradient);
            editor.apply();
        }
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }

    private void initializeDefaultBackground() {
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        if (!settings.contains("background")) {
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("background", R.drawable.fundal_welcome_gradient);
            editor.apply();
        }
    }


    private void resetBackgroundToDefault() {
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("background", R.drawable.fundal_welcome_gradient);
        editor.apply();
    }

}