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

public class CatCowExerciseActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutCatCow;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_cow_exercise);

        background = findViewById(R.id.layout_CatCow);
        textAboutCatCow = findViewById(R.id.txtExplanationCatCow);
        backButton = findViewById(R.id.back_button_CatCow);
        playButton = findViewById(R.id.btnPlayCatCow);
        pauseButton = findViewById(R.id.btnPauseCatCow);
        restartButton = findViewById(R.id.btnRestartCatCow);

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(CatCowExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        String htmlText = " <p>Start on all fours with your shoulders over your wrists and hips over knees.</p>\n" +
                "\n" +
                "        <p>Take a slow inhale, and on the exhale round your spine and drop your head toward the floor (this is the Cat posture).</p>\n" +
                "\n" +
                "        <p>Inhale and lift your head, chest, and tailbone toward the ceiling as you arch your back for Cow.</p>\n" +
                "\n" +
                "        <p>That’s 1 rep. Continue performing reps for 30 to 60 seconds. You should feel a stretch in your spine and possibly your glutes and shoulders as well.</p>\n" +
                "\n" +
                "        <p>To round your spine even more in Cat position, press into the floor with your hands and knees.</p>";
        textAboutCatCow.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        mediaPlayer = MediaPlayer.create(this, R.raw.cat_cow_audio);

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