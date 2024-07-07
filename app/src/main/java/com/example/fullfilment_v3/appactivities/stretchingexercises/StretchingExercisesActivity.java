package com.example.fullfilment_v3.appactivities.stretchingexercises;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.google.android.material.navigation.NavigationView;

public class StretchingExercisesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_exercises);

        drawer = findViewById(R.id.drawer_layout_stretching);
        imageView = findViewById(R.id.img_navST);
        navigationView = findViewById(R.id.idNavView3);
        drawer.closeDrawer(GravityCompat.START);

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
        return true;
    }
}