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

public class HipFlexorStretchExerciseActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutHipFlexor;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_flexor_stretch_exercise);

        background = findViewById(R.id.layout_hip_flexor_stretch);
        textAboutHipFlexor = findViewById(R.id.txtExplanationHipFlexorStretch);
        backButton = findViewById(R.id.back_button_hip_flexor_stretch);
        playButton = findViewById(R.id.btnPlayHipFlexorStretch);
        pauseButton = findViewById(R.id.btnPauseHipFlexorStretch);
        restartButton = findViewById(R.id.btnRestartHipFlexorStretrch);

        String htmlText = " <p>Kneel on one knee. Place the opposite foot flat in front of you, front thigh parallel to the floor, ankle underneath your knee.</p>\n" +
                "\n" +
                "        <p>Hold this position or, for a deeper stretch, lean forward, stretching your hip toward the floor (just make sure your knee doesn’t extend over your ankle).</p>\n" +
                "\n" +
                "        <p>Squeeze your butt; this will allow you to stretch your hip flexor even more.</p>\n" +
                "\n" +
                "        <p>For an even deeper stretch, reach up with the arm on the same side as the knee on the floor.</p>\n" +
                "\n" +
                "        <p>Hold for 30 to 60 seconds. Switch sides and repeat.</p>\n" +
                "\n" +
                "        <p>This is a more intense stretch, so you may want to take breaks during the 30 to 60 seconds, instead of holding the stretch all the way through. Also, if your grounded knee hurts, put a towel or doubled-over yoga mat under it for extra cushion.</p>";

        textAboutHipFlexor.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(HipFlexorStretchExerciseActivity.this, StretchingExercisesActivity.class);
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