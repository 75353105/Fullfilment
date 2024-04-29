package com.example.fullfilment_v3.appactivities.mentalhealthinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

import com.example.fullfilment_v3.R;

public class MentalHealthInfoActivity extends AppCompatActivity {

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

        cardViewPTSD.setOnClickListener(view -> {

        });
    }
}