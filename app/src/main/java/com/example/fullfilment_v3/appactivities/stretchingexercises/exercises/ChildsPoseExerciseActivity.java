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

public class ChildsPoseExerciseActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutChildsPose;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childs_pose_exercise);

        background = findViewById(R.id.layout_childs_pose);
        textAboutChildsPose = findViewById(R.id.txtExplanationChildsPose);
        backButton = findViewById(R.id.back_button_childs_pose);
        playButton = findViewById(R.id.btnPlayChildsPose);
        pauseButton = findViewById(R.id.btnPauseChildsPose);
        restartButton = findViewById(R.id.btnRestartChildsPose);

        String htmlText = "<p>Get into a kneeling position with your knees hip-distance apart and feet together behind you.</p>\n" +
                "\n" +
                "        <p>Take a deep inhale, and on the exhale lay your torso over your thighs, pressing your butt onto your heels and reaching your arms forward.</p>\n" +
                "\n" +
                "        <p>Think about lengthening your neck and spine by drawing your ribs away from your tailbone and the crown of your head away from your shoulders.</p>\n" +
                "\n" +
                "        <p>Rest your forehead on the mat. You should feel a stretch on your backside and possibly in your hips. You may also feel a stretch in your arms if they are straight in front. Hold for 30 to 60 seconds.</p>\n" +
                "\n" +
                "        <p>If you feel any back pain in this position, bring your knees closer together.</p>";
        textAboutChildsPose.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(ChildsPoseExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.childs_pose_audio);

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