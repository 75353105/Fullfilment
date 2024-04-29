package com.example.fullfilment_v3.appactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;

public class HomeDashboardActivity extends AppCompatActivity {

    CardView cardViewMeditaion;
    CardView cardViewStretchingExercises;
    CardView cardViewMentalHealthInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        cardViewMeditaion = findViewById(R.id.cardViewMeditation);
        cardViewStretchingExercises = findViewById(R.id.cardViewStrecthingExercises);
        cardViewMentalHealthInfo = findViewById(R.id.cardViewMentalHealth);

        cardViewMeditaion.setOnClickListener(view -> {

        });

        cardViewStretchingExercises.setOnClickListener(view -> {

        });

        cardViewMentalHealthInfo.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, MentalHealthInfoActivity.class);
            startActivity(intent);
        });
    }
}