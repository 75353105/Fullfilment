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

public class LyingGluteStretchExerciseActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutLyingGlute;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lying_glute_stretch_exercise);

        background = findViewById(R.id.layout_lying_glute_stretch);
        textAboutLyingGlute = findViewById(R.id.txtExplanationLyingGluteStretch);
        backButton = findViewById(R.id.back_button_lying_glute_stretch);
        playButton = findViewById(R.id.btnPlayLyingGluteStretch);
        pauseButton = findViewById(R.id.btnPauseLyingGluteStretch);
        restartButton = findViewById(R.id.btnRestartLyingGluteStretch);

        String htmlText = "<p>This stretch is good for putting some movement into your lower back, especially if you’ve been sitting still. You will have to get up and find a spot to lie down. (Remember, taking a brief break from whatever you’re doing can help relieve stress, too, Decker says.) What’s more, the stretch releases tight hamstrings.</p>\n" +
                "\n" +
                "        <p><b>How to Do It:</b></p>\n" +
                "        <p>Lie on your back and bend your knees so your feet are flat on the floor. Cross your right foot to your left knee, keeping your left leg bent, to create a figure four. Bring your hands behind your right knee and pull both legs toward your chest. Repeat on the other side. If you can’t reach the back of your knee, wrap a towel around your leg to pull it forward.</p>";

        textAboutLyingGlute.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(LyingGluteStretchExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.lying_glute_stretch_audio);

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