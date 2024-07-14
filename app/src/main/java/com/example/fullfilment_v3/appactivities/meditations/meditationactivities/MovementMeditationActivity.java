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

public class MovementMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutMovementMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movement_meditation);

        background = findViewById(R.id.layout_movement_meditation);
        textAboutMovementMeditation = findViewById(R.id.txtExplanationMovementMeditation);
        backButton = findViewById(R.id.back_button_movement_meditation);
        playButton = findViewById(R.id.btnPlayMovementMeditation);
        pauseButton = findViewById(R.id.btnPauseMovementMeditation);
        restartButton = findViewById(R.id.btnRestartMovementMeditation);

        String htmlText = "<p>Although most people think of yoga when they hear movement meditation, this practice may include:</p>\n" +
                "\n" +
                "        <ul>\n" +
                "            <li>walking</li>\n" +
                "            <li>gardening</li>\n" +
                "            <li>qi gong</li>\n" +
                "            <li>tai chi</li>\n" +
                "            <li>other gentle forms of movement</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>This is an active form of meditation where the movement guides you into a deeper connection with your body and the present moment.</p>\n" +
                "\n" +
                "        <p>Movement meditation is good for people who find peace in action and want to develop body awareness.</p>";
        textAboutMovementMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(MovementMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.movement_meditation_audio);

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