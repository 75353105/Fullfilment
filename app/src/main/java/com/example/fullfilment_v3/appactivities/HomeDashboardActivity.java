package com.example.fullfilment_v3.appactivities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.fullfilment_v3.R;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MeditationsActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.StretchingExercisesActivity;
import com.example.fullfilment_v3.signin.SignInActivity;

public class HomeDashboardActivity extends AppCompatActivity {

    CardView cardViewMeditaion;
    CardView cardViewStretchingExercises;
    CardView cardViewMentalHealthInfo;
    DrawerLayout drawer;
    ImageView imageView;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        cardViewMeditaion = findViewById(R.id.cardViewMeditation);
        cardViewStretchingExercises = findViewById(R.id.cardViewStrecthingExercises);
        cardViewMentalHealthInfo = findViewById(R.id.cardViewMentalHealth);
        drawer = findViewById(R.id.drawer_layout);
        imageView = findViewById(R.id.img_nav);
        btnExit = findViewById(R.id.btnExit);

        imageView.setOnClickListener(view -> {
            if(!drawer.isDrawerOpen(GravityCompat.START)){
                drawer.openDrawer(GravityCompat.START);
            } else {
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        cardViewMeditaion.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, MeditationsActivity.class);
            startActivity(intent);
        });

        cardViewStretchingExercises.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, StretchingExercisesActivity.class);
            startActivity(intent);
        });

        cardViewMentalHealthInfo.setOnClickListener(view -> {
            Intent intent = new Intent(HomeDashboardActivity.this, MentalHealthInfoActivity.class);
            startActivity(intent);
        });
        btnExit.setOnClickListener(view -> {
            AlertDialog dialog = new AlertDialog.Builder(HomeDashboardActivity.this)
                    .setTitle("Confirmation exiting the menu")
                    .setMessage("Are you sure you want to exit the menu?")
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    })
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            startActivity(new Intent(HomeDashboardActivity.this, WelcomePageActivity.class));
                            dialogInterface.cancel();
                        }
                    }).create();

            dialog.show();
        });
    }
}