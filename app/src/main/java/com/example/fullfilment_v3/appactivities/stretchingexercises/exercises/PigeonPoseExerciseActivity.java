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

public class PigeonPoseExerciseActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    RelativeLayout background;
    TextView textAboutPigeonPose;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigeon_pose_exercise);

        background = findViewById(R.id.layout_pigeon_pose);
        textAboutPigeonPose = findViewById(R.id.txtExplanationPigeonPose);
        backButton = findViewById(R.id.back_button_pigeon_pose);
        playButton = findViewById(R.id.btnPlayPigeonPose);
        pauseButton = findViewById(R.id.btnPausePigeonPose);
        restartButton = findViewById(R.id.btnRestartPigeonPose);

        String htmlText = "<p>From a kneeling position, get into Downward Facing Dog and extend your right leg high behind you. Then bring your right leg underneath your body and place it in front of you with your shin parallel to the top of your mat. (The goal isn’t to create an L-shape with your right leg; your foot can be tucked as close to your hips as needed.)</p>\n" +
                "\n" +
                "        <p>Extend your left leg long behind you and rest the top of your foot on the mat.</p>\n" +
                "\n" +
                "        <p>Keep your right foot flexed and try to keep your pelvis neutral and your left hip as close to the mat as you can. If your hip lifts off the floor, bring your right foot a little closer to your body.</p>\n" +
                "\n" +
                "        <p>You should feel a stretch in your right hip. Hold for 30 to 60 seconds. Switch sides and repeat.</p>\n" +
                "\n" +
                "        <p>To make sure your pelvis stays neutral, place a block or pillow underneath your externally rotated hip. You can also place a pillow or block underneath the knee on your straight leg to alleviate any pain. For a deeper stretch, lean your torso forward and rest your forehead on the ground, arms framing your face or resting at your sides.</p>";
        textAboutPigeonPose.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(PigeonPoseExerciseActivity.this, StretchingExercisesActivity.class);
            startActivity(backIntent);
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.pigeon_pose_audio);

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