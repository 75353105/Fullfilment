package com.example.fullfilment_v3.appactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.personalinfo.PersonalAccountActivity;
import com.example.fullfilment_v3.appactivities.settings.ThemesActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;
import com.google.android.material.navigation.NavigationView;

public class HomeDashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    CardView cardViewMeditaion;
    CardView cardViewStretchingExercises;
    CardView cardViewMentalHealthInfo;
    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        cardViewMeditaion = findViewById(R.id.cardViewMeditation);
        cardViewStretchingExercises = findViewById(R.id.cardViewStrecthingExercises);
        cardViewMentalHealthInfo = findViewById(R.id.cardViewMentalHealth);
        drawer = findViewById(R.id.drawer_layout);
        imageView = findViewById(R.id.img_nav);
        navigationView  = findViewById(R.id.idNavView1);
        btnExit = findViewById(R.id.btnExit);

        drawer.closeDrawer(GravityCompat.START);

        imageView.setOnClickListener(view -> {
            if(!drawer.isDrawerOpen(GravityCompat.START)){
                drawer.openDrawer(GravityCompat.START);
            } else {
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        cardViewMeditaion.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, MeditationsActivity.class);
            startActivity(intent);
        });

        cardViewStretchingExercises.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, StretchingExercisesActivity.class);
            startActivity(intent);
        });

        cardViewMentalHealthInfo.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, MentalHealthInfoActivity.class);
            startActivity(intent);
        });

        btnExit.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(HomeDashboardActivity.this)
                    .setTitle("Confirmation exiting the menu")
                    .setMessage("Are you sure you want to exit the menu?")
                    .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.cancel())
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        finish();
                        startActivity(new Intent(HomeDashboardActivity.this, WelcomePageActivity.class));
                        dialogInterface.cancel();
                    }).create();

            dialog.show();
        });
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
        if(id == R.id.idThemes) {
            Intent themesIntent = new Intent(HomeDashboardActivity.this, ThemesActivity.class);
            startActivity(themesIntent);
        }
        if(id == R.id.idPersonalAccount) {
            Intent personalAccountIntent = new Intent(HomeDashboardActivity.this, PersonalAccountActivity.class);
            startActivity(personalAccountIntent);
        }
        return true;
    }
}