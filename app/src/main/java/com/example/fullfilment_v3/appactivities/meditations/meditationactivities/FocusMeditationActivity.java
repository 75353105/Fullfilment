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

public class FocusMeditationActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    TextView textAboutFocusMeditation;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;
    RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_meditation);

        background = findViewById(R.id.layout_focus_meditation);
        textAboutFocusMeditation = findViewById(R.id.txtExplanationFocusMeditation);
        backButton = findViewById(R.id.back_button_focus_meditation);
        playButton = findViewById(R.id.btnPlayFocusMeditation);
        pauseButton = findViewById(R.id.btnPauseFocusMeditation);
        restartButton = findViewById(R.id.btnRestartFocusMeditation);

        String htmlText = "<p>Focused meditation involves concentration using any of the five senses.</p>\n" +
                "\n" +
                "        <p>For example, you can focus on something internal, like your breath, or you can bring in external influences to help focus your attention.</p>\n" +
                "\n" +
                "        <p>Examples include:</p>\n" +
                "\n" +
                "        <ul>\n" +
                "            <li>counting mala beads</li>\n" +
                "            <li>listening to a gong</li>\n" +
                "            <li>staring at a candle flame</li>\n" +
                "            <li>counting your breaths</li>\n" +
                "            <li>moon gazing</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>This practice may be simple in theory, but it can be difficult for beginners to hold their focus for longer than a few minutes at first.</p>\n" +
                "\n" +
                "        <p>If your mind does wander, simply come back to the practice and refocus.</p>\n" +
                "\n" +
                "        <p>As the name suggests, this practice is ideal for anyone who wants to sharpen their focus and attention.</p>";
        textAboutFocusMeditation.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(FocusMeditationActivity.this, MeditationsActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.focus_meditation_audio);

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