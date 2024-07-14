package com.example.fullfilment_v3.appactivities.stretchingexercises.exercises;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;

public class DownwardFacingDogExerciseActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutDownwardFacingDog;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downward_facing_dog_exxercise);

        background = findViewById(R.id.layout_downward_facing_dog);
        textAboutDownwardFacingDog = findViewById(R.id.txtExplanationDownwardFacingDog);
        backButton = findViewById(R.id.back_button_downward_facing_dog);
        playButton = findViewById(R.id.btnPlayDownwardFacingDog);
        pauseButton = findViewById(R.id.btnPauseDownwardFacingDog);
        restartButton = findViewById(R.id.btnRestartDownwardFacingDog);

        String htmlText = "<p>Start on your hands and knees with your hands stacked under your shoulders and knees under your hips.</p>\n" +
                "\n" +
                "        <p>Spread your hands wide and press your index finger and thumb into your mat.</p>\n" +
                "\n" +
                "        <p>Lift your tailbone and press your butt up and back, drawing your hips toward the ceiling. Straighten your legs as best as you can and press your heels gently toward the floor.</p>\n" +
                "\n" +
                "        <p>Your head should be relaxed between your arms, facing your knees; your shoulders should be pulled back and down; and your back should be flat. You may feel a stretch in your hamstrings, calves, back, and/or shoulders.</p>\n" +
                "\n" +
                "        <p>Hold for 30 to 60 seconds.</p>";

        textAboutDownwardFacingDog.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(DownwardFacingDogExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.downward_facing_dog_stretching_exercise_audio);

        playButton.setOnClickListener(view ->{
            if(!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
        });

        pauseButton.setOnClickListener(view ->{
            if(mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
        });

        restartButton.setOnClickListener(view -> {
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}