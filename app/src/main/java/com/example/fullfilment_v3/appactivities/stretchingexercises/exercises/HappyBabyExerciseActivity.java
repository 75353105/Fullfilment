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

public class HappyBabyExerciseActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutHappyBaby;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_baby_exercise);

        background = findViewById(R.id.layout_happy_baby);
        textAboutHappyBaby = findViewById(R.id.txtExplanationHappyBaby);
        backButton = findViewById(R.id.back_button_happy_baby);
        playButton = findViewById(R.id.btnPlayHappyBaby);
        pauseButton = findViewById(R.id.btnPauseHappyBaby);
        restartButton = findViewById(R.id.btnRestartHappyBaby);

        String htmlText = "<p>The benefit of this stretch is that it will help open your hips, which is a common reason for a tight back.</p>\n" +
                "\n" +
                "        <p><b>How to Do It:</b></p>\n" +
                "        <p>Lying on your back, lift your knees toward your chest. Grab the bottoms of each foot with your hands and pull your knees toward your chest and armpits. If you can’t reach your feet, just grab your lower legs.</p>";

        textAboutHappyBaby.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(HappyBabyExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.happy_baby_audio);

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