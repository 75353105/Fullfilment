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

public class ChestOpenerStretchActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutChestOpener;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_opener_stretch);

        background = findViewById(R.id.layout_chest_opener_stretch);
        textAboutChestOpener = findViewById(R.id.txtExplanationChestOpenerStretch);
        backButton = findViewById(R.id.back_button_chest_opener_stretch);
        playButton = findViewById(R.id.btnPlayChestOpenerStretch);
        pauseButton = findViewById(R.id.btnPauseChestOpenerStretch);
        restartButton = findViewById(R.id.btnRestartChestOpenerStretch);

        String htmlText = "<p>This is a great at-your-desk stretch when you need a quick release.</p>" +
                "<p><b>How to Do It:</b></p>\n" +
                "<p>Clasp your hands behind your back, squeeze your upper shoulder blades toward each other behind you, and push out through your chest. Keep your core straight, and avoid overextending your back.</p>";
        textAboutChestOpener.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(ChestOpenerStretchActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.chest_opener_stretch_audio);

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