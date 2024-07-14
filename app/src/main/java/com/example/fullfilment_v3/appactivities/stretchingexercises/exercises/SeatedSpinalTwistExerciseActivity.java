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

public class SeatedSpinalTwistExerciseActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutSeatedSpinalTwist;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seated_spinal_twist_exercise);

        background = findViewById(R.id.layout_seated_spinal_twist);
        textAboutSeatedSpinalTwist = findViewById(R.id.txtExplanationSeatedSpinalTwist);
        backButton = findViewById(R.id.back_button_SeatedSpinalTwist);
        playButton = findViewById(R.id.btnPlaySeatedSpinalTwist);
        pauseButton = findViewById(R.id.btnPauseSeatedSpinalTwist);
        restartButton = findViewById(R.id.btnRestartSeatedSpinalTwist);

        String htmlText = "Sit up straight on your butt with your legs crossed. Make sure you’re not rounding your pelvis.\n" +
                "\n" +
                "Place your left arm on your right knee and your right arm behind you, fingers on the ground facing away from your body.\n" +
                "\n" +
                "Inhale and elongate your spine, then exhale and rotate to the right. Your goal is to look over your right shoulder while also keeping both shoulders relaxed and away from your ears.\n" +
                "\n" +
                "Hold for 30 to 60 seconds. Switch sides and repeat.\n" +
                "\n" +
                "Take your time to ease into this stretch; don’t yank your spine.";
        textAboutSeatedSpinalTwist.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(SeatedSpinalTwistExerciseActivity.this, StretchingExercisesActivity.class);
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