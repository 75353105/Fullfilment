package com.example.fullfilment_v3.appactivities.mentalhealthinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.articles.PTSDInfoActivity;
import com.google.android.material.navigation.NavigationView;

public class MentalHealthInfoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    CardView cardViewPTSD;
    CardView cardViewDepression;
    CardView cardViewAnxiety;
    CardView cardViewADHD;
    CardView cardViewBipolarDisorder;
    CardView cardViewOCD;
    CardView cardViewInsomnia;
    CardView cardViewSelfEsteem;
    CardView cardViewSuicidalThoughts;
    CardView cardViewFocusAndDiscipline;
    DrawerLayout drawer;
    ImageView imageView;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health_info);

        cardViewADHD = findViewById(R.id.cardViewADHD);
        cardViewAnxiety = findViewById(R.id.cardViewAnxiety);
        cardViewBipolarDisorder = findViewById(R.id.cardViewBipolarDisorder);
        cardViewDepression = findViewById(R.id.cardViewDepression);
        cardViewFocusAndDiscipline = findViewById(R.id.cardViewFocusAndDiscipline);
        cardViewInsomnia = findViewById(R.id.cardViewInsomnia);
        cardViewOCD = findViewById(R.id.cardViewOCD);
        cardViewSelfEsteem = findViewById(R.id.cardViewSelfEsteem);
        cardViewSuicidalThoughts = findViewById(R.id.cardViewSuicidalToughts);
        cardViewPTSD = findViewById(R.id.cardViewPTSD);
        drawer = findViewById(R.id.drawer_layout_mental_health);
        imageView = findViewById(R.id.img_navMH);
        navigationView = findViewById(R.id.idNavView4);

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

        cardViewPTSD.setOnClickListener(view -> {
            Intent intent = new Intent(MentalHealthInfoActivity.this, PTSDInfoActivity.class);
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
        return true;
    }
}