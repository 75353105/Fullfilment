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

public class ForwardFoldActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutForwardFold;
    ImageView backButton;
    ImageView playButton;
    ImageView pauseButton;
    ImageView restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forward_fold);

        background = findViewById(R.id.layout_forward_fold);
        textAboutForwardFold = findViewById(R.id.txtExplanationForwardFold);
        backButton = findViewById(R.id.back_button_forward_fold);
        playButton = findViewById(R.id.btnPlayForwardFold);
        pauseButton = findViewById(R.id.btnPauseForwardFold);
        restartButton = findViewById(R.id.btnRestartForwardFold);

        String htmlText = "<p>Stand with your feet shoulder-width apart.</p>\n" +
                "\n" +
                "        <p>Straighten your legs out as much as you can without locking your knees and let your torso hang down.</p>\n" +
                "\n" +
                "        <p>Tuck your chin in toward your chest, relax your shoulders, and extend the crown of your head toward the floor to create a long spine.</p>\n" +
                "\n" +
                "        <p>Depending on your flexibility, your hands will touch the floor or dangle above floor level. You can hold onto each elbow with the opposite arm or let your arms hang separately.</p>\n" +
                "\n" +
                "        <p>You should feel a stretch in your back and hamstrings.</p>\n" +
                "\n" +
                "        <p>Hold for 30 to 60 seconds.</p>";

        textAboutForwardFold.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(ForwardFoldActivity.this, StretchingExercisesActivity.class);
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