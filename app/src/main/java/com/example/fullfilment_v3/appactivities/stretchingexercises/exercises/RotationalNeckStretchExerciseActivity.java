package com.example.fullfilment_v3.appactivities.stretchingexercises.exercises;

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
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;

public class RotationalNeckStretchExerciseActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutRotationalNeckStretch;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotational_neck_stretch_exercise);

        background = findViewById(R.id.layout_rotational_neck_stretch);
        textAboutRotationalNeckStretch = findViewById(R.id.txtExplanationRotationalNeckStretch);
        backButton = findViewById(R.id.back_button_rotational_neck_stretch);
        playButton = findViewById(R.id.btnPlayRotationalNeckStretch);
        pauseButton = findViewById(R.id.btnPauseRotationalneckStretch);
        restartButton = findViewById(R.id.btnRestartRotationalNeckStretch);

        String htmlText = "<p>Reacting to stress by tensing up your neck and scalp muscles can trigger a tension headache.</p>\n" +
                "\n" +
                "        <p>To keep healthy flexion in your neck and let go of tightness, Decker recommends this simple and effective neck stretch, which targets the muscles in the back of your neck.</p>\n" +
                "\n" +
                "        <p><b>How to Do It:</b></p>\n" +
                "        <p>Bring your chin to your chest and rotate your chin toward an armpit. If you need more of a stretch, Decker suggests placing your hand on the back of your head and pushing your head closer to your armpit. Repeat, rotating your chin to the other armpit. Be mindful not to elevate your shoulders, keeping them relaxed throughout the stretch.</p>";
        textAboutRotationalNeckStretch.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(RotationalNeckStretchExerciseActivity.this, StretchingExercisesActivity.class);
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