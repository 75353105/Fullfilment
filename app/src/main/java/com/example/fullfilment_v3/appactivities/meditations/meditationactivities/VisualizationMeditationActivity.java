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

public class VisualizationMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutVisualizationMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualization_meditation);

        background = findViewById(R.id.layout_visualization_meditation);
        textAboutVisualizationMeditation = findViewById(R.id.txtExplanationVisualizationMeditation);
        backButton = findViewById(R.id.back_button_visualization_meditation);
        playButton = findViewById(R.id.btnPlayVisualizationMeditation);
        pauseButton = findViewById(R.id.btnPauseVisualizationMeditation);
        restartButton = findViewById(R.id.btnRestartVisualizationMeditation);

        String htmlText = "<p>Visualization meditation is a technique focused on enhancing feelings of relaxation, peace, and calmness by visualizing positive scenes, images, or figures.</p>\n" +
                "\n" +
                "    <p>This practice involves imagining a scene vividly and using all five senses to add as much detail as possible. It can also involve holding a beloved or honored figure in mind with the intention of embodying their qualities.</p>\n" +
                "\n" +
                "    <p>Another form of visualization meditation involves imagining yourself succeeding at specific goals, which is intended to increase focus and motivation.</p>\n" +
                "\n" +
                "    <p>Many people use visualization meditation to boost their mood, reduce stress levels, and promote inner peace.</p>";
        textAboutVisualizationMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(VisualizationMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.visualization_meditation_audio);

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
