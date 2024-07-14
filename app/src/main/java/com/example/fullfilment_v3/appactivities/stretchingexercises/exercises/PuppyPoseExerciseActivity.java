package com.example.fullfilment_v3.appactivities.stretchingexercises.exercises;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.stretchingexercises.StretchingExercisesActivity;

public class PuppyPoseExerciseActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutPuppyPose;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puppy_pose_exercise);

        background = findViewById(R.id.layout_puppy_pose);
        textAboutPuppyPose = findViewById(R.id.txtExplanationPuppyPose);
        backButton = findViewById(R.id.back_button_puppy_pose);
        playButton = findViewById(R.id.btnPlayPuppyPose);
        pauseButton = findViewById(R.id.btnPausePuppyPose);
        restartButton = findViewById(R.id.btnRestartPuppyPose);

        String htmlText = "<p>Get into tabletop position with your wrists under shoulders, knees under hips.</p>\n" +
                "\n" +
                "        <p>Walk your arms forward and bring your chin to the floor while keeping your butt lifted above your knees. Your arms should be stretched out in front and your armpits lifted off the floor. You should feel a stretch in your armpits, across the front of your chest, and in your core.</p>\n" +
                "\n" +
                "        <p>Hold for 30 to 60 seconds.</p>\n" +
                "\n" +
                "        <p>If it hurts to rest your chin on the floor, rest your forehead instead.</p>";
        textAboutPuppyPose.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(PuppyPoseExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        playButton.setOnClickListener(view ->{

        });

        pauseButton.setOnClickListener(view ->{

        });

        restartButton.setOnClickListener(view -> {

        });
    }

    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }

}