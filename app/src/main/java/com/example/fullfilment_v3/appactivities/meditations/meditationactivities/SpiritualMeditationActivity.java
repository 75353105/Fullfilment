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

public class SpiritualMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutSpiritualMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiritual_meditation);

        background = findViewById(R.id.layout_spiritual_meditation);
        textAboutSpiritualMeditation = findViewById(R.id.txtExplanationSpiritualMeditation);
        backButton = findViewById(R.id.back_button_spiritual_meditation);
        playButton = findViewById(R.id.btnPlaySpiritualMeditation);
        pauseButton = findViewById(R.id.btnPauseSpiritualMeditation);
        restartButton = findViewById(R.id.btnRestartSpiritualMeditation);

        String htmlText = "<p>Spiritual meditation is used in nearly all religions and spiritual traditions.</p>\n" +
                "\n" +
                "        <p>The types of spiritual meditation are as diverse as the world’s spiritual traditions themselves. Many of the meditation techniques listed in this article could be considered spiritual meditation.</p>\n" +
                "\n" +
                "        <p>According to a 2017 study, spiritual meditation focuses on developing a deeper understanding of spiritual/religious meaning and connection with a higher power. Examples include:</p>\n" +
                "\n" +
                "        <ul>\n" +
                "            <li>Christian contemplative prayer</li>\n" +
                "            <li>Sufi dhikr (remembrance of God)</li>\n" +
                "            <li>Jewish kabbalistic practices</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>Spiritual meditation can be practiced at home or in a place of worship. This practice is beneficial for those who seek spiritual growth and a deeper connection to a higher power or spiritual force.</p>";
        textAboutSpiritualMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(SpiritualMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.spiritual_meditation_audio);

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