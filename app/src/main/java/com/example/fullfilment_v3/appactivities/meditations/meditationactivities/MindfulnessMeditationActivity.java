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

public class MindfulnessMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutMindfulnessMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfulness_meditation);

        background = findViewById(R.id.layout_mindfulness_meditation);
        textAboutMindfulnessMeditation = findViewById(R.id.txtExplanationMindfulnessMeditation);
        backButton = findViewById(R.id.back_button_mindfulness_meditation);
        playButton = findViewById(R.id.btnPlayMindfulnessMeditation);
        pauseButton = findViewById(R.id.btnPauseMindfulnessMeditation);
        restartButton = findViewById(R.id.btnRestartMindfulnessMeditation);

        String htmlText = "<p>Mindfulness meditation originates from Buddhist teachings and is the most popular and researched form of meditation in the West.</p>\n" +
                "\n" +
                "        <p>In mindfulness meditation, you pay attention to your thoughts as they pass through your mind. You don’t judge the thoughts or become involved with them. You simply observe and take note of any patterns.</p>\n" +
                "\n" +
                "        <p>This practice combines concentration with awareness. You may find it helpful to focus on an object or your breath while you observe any bodily sensations, thoughts, or feelings.</p>\n" +
                "\n" +
                "        <p>This type of meditation is good for people who don’t have a teacher to guide them, as it can be easily practiced alone.</p>";
        textAboutMindfulnessMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(MindfulnessMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.mindfulness_meditation_audio);

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