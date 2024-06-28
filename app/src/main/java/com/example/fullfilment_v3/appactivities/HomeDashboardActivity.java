package com.example.fullfilment_v3.appactivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.StretchingExercisesActivity;

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
    }
}