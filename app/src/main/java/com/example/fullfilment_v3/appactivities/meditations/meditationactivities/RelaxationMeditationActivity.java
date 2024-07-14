package com.example.fullfilment_v3.appactivities.meditations.meditationactivities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;

public class RelaxationMeditationActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutRelaxationMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxation_meditation);

        background = findViewById(R.id.layout_progrssive_relaxation);
        textAboutRelaxationMeditation = findViewById(R.id.txtExplanationRelaxationMeditation);
        backButton = findViewById(R.id.back_button_relaxation_meditation);
        playButton = findViewById(R.id.btnPlayRelaxationMeditation);
        pauseButton = findViewById(R.id.btnPauseRelaxationMeditation);
        restartButton = findViewById(R.id.btnRestartRelaxationMeditation);

        String htmlText = "<p>Also known as body scan meditation, progressive relaxation is a practice aimed at reducing tension in the body and promoting relaxation.</p>\n" +
                "\n" +
                "    <p>Oftentimes, this form of meditation involves slowly tightening and relaxing one muscle group at a time throughout the body.</p>\n" +
                "\n" +
                "    <p>In some cases, it may also encourage you to imagine a gentle wave flowing through your body to help release any tension.</p>\n" +
                "\n" +
                "    <p>This form of meditation is often used to relieve stress and unwind before bedtime.</p>";
        textAboutRelaxationMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(RelaxationMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        playButton.setOnClickListener(view ->{

        });

        pauseButton.setOnClickListener(view ->{

        });

        restartButton.setOnClickListener(view -> {

        });
    }

    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }
}