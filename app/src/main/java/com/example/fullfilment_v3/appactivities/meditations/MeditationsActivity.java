package com.example.fullfilment_v3.appactivities.meditations;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.HomeDashboardActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.FocusMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.LovingKindnessMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.MantraMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.MindfulnessMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.MovementMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.RelaxationMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.SpiritualMeditationActivity;
import com.example.fullfilment_v3.appactivities.meditations.meditationactivities.VisualizationMeditationActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.personalinfo.PersonalAccountActivity;
import com.example.fullfilment_v3.appactivities.settings.ThemesActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;
import com.google.android.material.navigation.NavigationView;

public class MeditationsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RelativeLayout background;
    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;
    CardView cardViewMindfulness;
    CardView cardViewSpiritual;
    CardView cardViewFocus;
    CardView cardViewMovement;
    CardView cardViewMantra;
    CardView cardViewRelaxation;
    CardView cardViewLovingKindness;
    CardView cardViewVisualization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditations);

        background= findViewById(R.id.layout_meditations);
        drawer = findViewById(R.id.drawer_layout_meditations);
        imageView = findViewById(R.id.img_navMED);
        navigationView = findViewById(R.id.idNavView2);
        cardViewMindfulness = findViewById(R.id.cardViewMindfulnessMeditation);
        cardViewSpiritual = findViewById(R.id.cardViewSpiritualMeditation);
        cardViewFocus = findViewById(R.id.cardViewFocusedMeditation);
        cardViewMantra = findViewById(R.id.cardViewMantraMeditation);
        cardViewMovement = findViewById(R.id.cardViewMovementMeditation);
        cardViewRelaxation = findViewById(R.id.cardViewProgressiveRelaxation);
        cardViewLovingKindness = findViewById(R.id.cardViewLovingKindness);
        cardViewVisualization = findViewById(R.id.cardViewVisualizationMeditation);

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

        cardViewMindfulness.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, MindfulnessMeditationActivity.class);
            startActivity(intent);
        });

        cardViewSpiritual.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, SpiritualMeditationActivity.class);
            startActivity(intent);
        });

        cardViewFocus.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, FocusMeditationActivity.class);
            startActivity(intent);
        });

        cardViewMovement.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, MovementMeditationActivity.class);
            startActivity(intent);
        });

        cardViewMantra.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, MantraMeditationActivity.class);
            startActivity(intent);
        });

        cardViewRelaxation.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, RelaxationMeditationActivity.class);
            startActivity(intent);
        });

        cardViewLovingKindness.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, LovingKindnessMeditationActivity.class);
            startActivity(intent);
        });

        cardViewVisualization.setOnClickListener(view -> {
            Intent intent = new Intent(MeditationsActivity.this, VisualizationMeditationActivity.class);
            startActivity(intent);
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
        if(id == R.id.idMentalHealth) {
            finish();
            Intent mentalHealthIntent = new Intent(MeditationsActivity.this, MentalHealthInfoActivity.class);
            startActivity(mentalHealthIntent);
        }
        if(id == R.id.idExercises) {
            finish();
            Intent exercisesIntent = new Intent(MeditationsActivity.this, StretchingExercisesActivity.class);
            startActivity(exercisesIntent);
        }
        if(id == R.id.idHome) {
            finish();
            Intent homeIntent = new Intent(MeditationsActivity.this, HomeDashboardActivity.class);
            startActivity(homeIntent);
        }
        if(id == R.id.idThemes) {
            finish();
            Intent themesIntent = new Intent(MeditationsActivity.this, ThemesActivity.class);
            startActivity(themesIntent);
        }
        if(id == R.id.idPersonalAccount) {
            finish();
            Intent personalAccountIntent = new Intent(MeditationsActivity.this, PersonalAccountActivity.class);
            startActivity(personalAccountIntent);
        }
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
        navigationView.setBackgroundResource(backgroundId);
    }
}