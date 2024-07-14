package com.example.fullfilment_v3.appactivities.stretchingexercises;

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
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.personalinfo.PersonalAccountActivity;
import com.example.fullfilment_v3.appactivities.settings.ThemesActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.CatCowExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.ChestOpenerStretchActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.DownwardFacingDogExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.ForwardFoldActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.HappyBabyExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.HipFlexorStretchExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.LyingGluteStretchExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.PigeonPoseExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.PuppyPoseExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.RotationalNeckStretchExerciseActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.exercises.SeatedSpinalTwistExerciseActivity;
import com.google.android.material.navigation.NavigationView;

public class StretchingExercisesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RelativeLayout background;
    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;
    CardView cardViewChildsPose;
    CardView cardViewCatCow;
    CardView cardViewPuppyPose;
    CardView cardViewHipFlexorStretch;
    CardView cardViewDowanwardFacingDog;
    CardView cardViewForwardFold;
    CardView cardViewSeatedSpinalTwist;
    CardView cardViewPigeonPose;
    CardView cardViewHappyBaby;
    CardView cardViewLyingGluteStretch;
    CardView cardViewChestOpenerStretch;
    CardView cardViewRotationalNeckStretch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_exercises);

        background = findViewById(R.id.layout_exercises);
        drawer = findViewById(R.id.drawer_layout_stretching);
        imageView = findViewById(R.id.img_navST);
        navigationView = findViewById(R.id.idNavView3);
        drawer.closeDrawer(GravityCompat.START);
        cardViewChildsPose = findViewById(R.id.cardViewChildsPose);
        cardViewCatCow = findViewById(R.id.cardViewCatCow);
        cardViewChestOpenerStretch = findViewById(R.id.cardViewChestOpenerStrertch);
        cardViewDowanwardFacingDog = findViewById(R.id.cardViewDownwardFacingDog);
        cardViewForwardFold = findViewById(R.id.cardViewForwardFold);
        cardViewHappyBaby = findViewById(R.id.cardViewHappyBaby);
        cardViewHipFlexorStretch = findViewById(R.id.cardViewHipFlexorStretch);
        cardViewLyingGluteStretch = findViewById(R.id.cardViewLyingGluteStretch);
        cardViewPigeonPose = findViewById(R.id.cardViewPigeonPose);
        cardViewPuppyPose = findViewById(R.id.cardViewPuppyPose);
        cardViewRotationalNeckStretch = findViewById(R.id.cardViewRotationalNeckStretch);
        cardViewSeatedSpinalTwist = findViewById(R.id.cardViewSeatedSpinalTwist);

        cardViewCatCow.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, CatCowExerciseActivity.class);
            startActivity(intent);
        });
        cardViewChildsPose.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, CatCowExerciseActivity.class);
            startActivity(intent);
        });

        cardViewChestOpenerStretch.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, ChestOpenerStretchActivity.class);
            startActivity(intent);
        });

        cardViewDowanwardFacingDog.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, DownwardFacingDogExerciseActivity.class);
            startActivity(intent);
        });
        cardViewForwardFold.setOnClickListener(view -> {
            Intent intent  = new Intent(StretchingExercisesActivity.this, ForwardFoldActivity.class);
            startActivity(intent);
        });
        cardViewHappyBaby.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, HappyBabyExerciseActivity.class);
            startActivity(intent);
        });
        cardViewHipFlexorStretch.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, HipFlexorStretchExerciseActivity.class);
            startActivity(intent);
        });
        cardViewLyingGluteStretch.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, LyingGluteStretchExerciseActivity.class);
            startActivity(intent);
        });
        cardViewPigeonPose.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, PigeonPoseExerciseActivity.class);
            startActivity(intent);
        });
        cardViewPuppyPose.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, PuppyPoseExerciseActivity.class);
            startActivity(intent);
        });
        cardViewRotationalNeckStretch.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, RotationalNeckStretchExerciseActivity.class);
            startActivity(intent);
        });
        cardViewSeatedSpinalTwist.setOnClickListener(view -> {
            Intent intent = new Intent(StretchingExercisesActivity.this, SeatedSpinalTwistExerciseActivity.class);
            startActivity(intent);
        });
        imageView.setOnClickListener(view -> {
            if(!drawer.isDrawerOpen(GravityCompat.START))  {
                drawer.openDrawer(GravityCompat.START);
            } else {
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
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
            Intent meditationIntent = new Intent(StretchingExercisesActivity.this, MeditationsActivity.class);
            startActivity(meditationIntent);
        }
        if(id == R.id.idMentalHealth) {
            finish();
            Intent mentalHealthIntent = new Intent(StretchingExercisesActivity.this, MentalHealthInfoActivity.class);
            startActivity(mentalHealthIntent);
        }
        if(id == R.id.idHome) {
            finish();
            Intent homeIntent = new Intent(StretchingExercisesActivity.this, HomeDashboardActivity.class);
            startActivity(homeIntent);
        }
        if(id == R.id.idThemes) {
            finish();
            Intent themesIntent = new Intent(StretchingExercisesActivity.this, ThemesActivity.class);
            startActivity(themesIntent);
        }
        if(id == R.id.idPersonalAccount) {
            finish();
            Intent personalAccountIntent = new Intent(StretchingExercisesActivity.this, PersonalAccountActivity.class);
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