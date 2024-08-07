package com.example.fullfilment_v3.appactivities.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.HomeDashboardActivity;
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.personalinfo.PersonalAccountActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;
import com.google.android.material.navigation.NavigationView;

public class ThemesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;
    CardView cardViewTheme1;
    CardView cardViewTheme2;
    CardView cardViewTheme3;
    CardView cardViewTheme4;
    CardView cardViewTheme5;
    CardView cardViewTheme6;
    RelativeLayout background;
    long userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);

        drawer = findViewById(R.id.drawer_layout_themes);
        imageView = findViewById(R.id.img_nav_themes);
        navigationView = findViewById(R.id.idNavView5);
        cardViewTheme1 = findViewById(R.id.cardViewTheme1);
        cardViewTheme2 = findViewById(R.id.cardViewTheme2);
        cardViewTheme3 = findViewById(R.id.cardViewTheme3);
        cardViewTheme4 = findViewById(R.id.cardViewTheme4);
        cardViewTheme5 = findViewById(R.id.cardViewTheme5);
        cardViewTheme6 = findViewById(R.id.cardViewTheme6);
        background = findViewById(R.id.layout_themes);

        drawer.closeDrawer(GravityCompat.START);
        imageView.setOnClickListener(view -> {
            if(!drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.openDrawer(GravityCompat.START);
            } else {
                drawer.closeDrawer(GravityCompat.START);
            }
        });
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        cardViewTheme1.setOnClickListener(view -> changeTheme(R.drawable.fundal_login_gradient));
        cardViewTheme2.setOnClickListener(view -> changeTheme(R.drawable.fundal_welcome_gradient));
        cardViewTheme3.setOnClickListener(view -> changeTheme(R.drawable.gradient_dashboard_2));
        cardViewTheme4.setOnClickListener(view -> changeTheme(R.drawable.fundal_tema_verde_roz));
        cardViewTheme5.setOnClickListener(view -> changeTheme(R.drawable.fundal_tema_roz_maro));
        cardViewTheme6.setOnClickListener(view -> changeTheme(R.drawable.fundal_mental_health));
    }

    private void changeTheme(int backgroundResId) {
        AlertDialog dialog = new AlertDialog.Builder(ThemesActivity.this)
                .setTitle("Changing the theme")
                .setMessage("Are you sure you want to change the theme?")
                .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel())
                .setPositiveButton("Yes", (dialogInterface, i) -> {
                    SharedPreferences prefs = getSharedPreferences("Background", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putInt("background", backgroundResId);
                    editor.apply();
                    dialogInterface.cancel();
                }).create();

        dialog.show();
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.idMeditation) {
            finish();
            Intent meditationIntent = new Intent(ThemesActivity.this, MeditationsActivity.class);
            startActivity(meditationIntent);
        }
        if(id == R.id.idExercises) {
            finish();
            Intent stretchingIntent = new Intent(ThemesActivity.this, StretchingExercisesActivity.class);
            startActivity(stretchingIntent);
        }
        if(id == R.id.idMentalHealth) {
            finish();
            Intent mentalHealthIntent = new Intent(ThemesActivity.this, MentalHealthInfoActivity.class);
            startActivity(mentalHealthIntent);
        }
        if(id == R.id.idHome) {
            finish();
            Intent homeIntent = new Intent(ThemesActivity.this, HomeDashboardActivity.class);
            startActivity(homeIntent);
        }
        if(id == R.id.idPersonalAccount) {
            finish();
            Intent personalAccountIntent = new Intent(ThemesActivity.this, PersonalAccountActivity.class);
            startActivity(personalAccountIntent);
        }
        return true;
    }
    private void applyBackground() {
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
        navigationView.setBackgroundResource(backgroundId);
    }

    @Override
    protected void onResume() {
        super.onResume();
        applyBackground();
    }
}