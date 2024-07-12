package com.example.fullfilment_v3.appactivities.mentalhealthinfo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.HomeDashboardActivity;
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.articles.PTSDInfoActivity;
import com.example.fullfilment_v3.appactivities.personalinfo.PersonalAccountActivity;
import com.example.fullfilment_v3.appactivities.settings.ThemesActivity;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;
import com.google.android.material.navigation.NavigationView;

public class MentalHealthInfoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RelativeLayout background;
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
    TextView linkToBetterHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health_info);

        background = findViewById(R.id.layout_mental_health);
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
        linkToBetterHelp = findViewById(R.id.indicationLinkToBetterHelp);
        linkToBetterHelp.setMovementMethod(LinkMovementMethod.getInstance());

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

        int id = item.getItemId();
        if(id == R.id.idMeditation) {
            Intent meditationIntent = new Intent(MentalHealthInfoActivity.this, MeditationsActivity.class);
            startActivity(meditationIntent);
        }
        if(id == R.id.idExercises) {
            Intent exercisesIntent = new Intent(MentalHealthInfoActivity.this, StretchingExercisesActivity.class);
            startActivity(exercisesIntent);
        }
        if(id == R.id.idHome) {
            Intent homeIntent = new Intent(MentalHealthInfoActivity.this, HomeDashboardActivity.class);
            startActivity(homeIntent);
        }
        if(id == R.id.idThemes) {
            Intent themesIntent = new Intent(MentalHealthInfoActivity.this, ThemesActivity.class);
            startActivity(themesIntent);
        }
        if(id == R.id.idPersonalAccount) {
            Intent personalAccountIntent = new Intent(MentalHealthInfoActivity.this, PersonalAccountActivity.class);
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