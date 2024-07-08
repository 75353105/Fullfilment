package com.example.fullfilment_v3.appactivities.mentalhealthinfo.articles;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fullfilment_v3.R;

public class PTSDInfoActivity extends AppCompatActivity {

    RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsdinfo);

        background = findViewById(R.id.layout_PTSD);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_mental_health);
        background.setBackgroundResource(backgroundId);
    }
}