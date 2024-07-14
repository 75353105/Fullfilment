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

public class MantraMeditationActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutMantraMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantra_meditation);

        background = findViewById(R.id.layout_mantra_meditation);
        textAboutMantraMeditation = findViewById(R.id.txtExplanationMantraMeditation);
        backButton = findViewById(R.id.back_button_mantra_meditation);
        playButton = findViewById(R.id.btnPlayMantraMeditation);
        pauseButton = findViewById(R.id.btnPauseMantraMeditation);
        restartButton = findViewById(R.id.btnRestartMantraMeditation);

        String htmlText = " <p>Mantra meditation is prominent in many teachings, including Hindu and Buddhist traditions. This type of meditation uses a repetitive sound to clear the mind. It can be a word, phrase, or sound, one of the most common being “om.”</p>\n" +
                "\n" +
                "        <p>Your mantra can be spoken loudly or quietly. After chanting the mantra for some time, you’ll be more alert and in tune with your environment. This allows you to experience deeper levels of awareness.</p>\n" +
                "\n" +
                "        <p>Some people enjoy mantra meditation because they find it easier to focus on a word than on their breath. Others enjoy feeling the vibration of the sound in their body.</p>\n" +
                "\n" +
                "        <p>This is also a good practice for people who don’t like silence and enjoy repetition.</p>";
        textAboutMantraMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(MantraMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.mantra_meditation_audio);

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