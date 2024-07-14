package com.example.fullfilment_v3.appactivities.meditations.meditationactivities;

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
import com.example.fullfilment_v3.appactivities.meditations.MeditationsActivity;

public class LovingKindnessMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutLovingKindnessMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loving_kindness_meditation);

        background = findViewById(R.id.layout_loving_kindness_meditation);
        textAboutLovingKindnessMeditation = findViewById(R.id.txtExplanationLovingKindnessMeditation);
        backButton = findViewById(R.id.back_button_loving_kindness_meditation);
        playButton = findViewById(R.id.btnPlayLovingKindnessMeditation);
        pauseButton = findViewById(R.id.btnPauseLovingKindnessMeditation);
        restartButton = findViewById(R.id.btnRestartLovingKindnessMeditation);

        String htmlText = "<p>Loving-kindness meditation is used to strengthen feelings of compassion, kindness, and acceptance toward oneself and others.</p>\n" +
                "\n" +
                "    <p>It typically involves opening the mind to receive love from others and then sending well wishes to loved ones, friends, acquaintances, and all living beings.</p>\n" +
                "\n" +
                "    <p>Because this type of meditation is intended to promote compassion and kindness, it may be ideal for those holding feelings of anger or resentment.</p>";
        textAboutLovingKindnessMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(LovingKindnessMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.loving_kindness_meditation_audio);

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