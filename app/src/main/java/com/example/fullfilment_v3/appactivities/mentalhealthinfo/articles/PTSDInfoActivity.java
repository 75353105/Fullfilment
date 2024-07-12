package com.example.fullfilment_v3.appactivities.mentalhealthinfo.articles;

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
import com.example.fullfilment_v3.appactivities.mentalhealthinfo.MentalHealthInfoActivity;

public class PTSDInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textViewAboutPTSD;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsdinfo);

        background = findViewById(R.id.layout_PTSD);
        textViewAboutPTSD = findViewById(R.id.txtAboutPTSD);
        backButton = findViewById(R.id.back_button_PTSD);

        String htmlText = "<p>Post-traumatic stress disorder (PTSD) is a mental health condition that's triggered by a terrifying event—either experiencing it or witnessing it. Symptoms may include flashbacks, nightmares and severe anxiety, as well as uncontrollable thoughts about the event.</p>"
                + "<p>Most people who go through traumatic events may have temporary difficulty adjusting and coping, but with time and good self-care, they usually get better. If the symptoms get worse, last for months or even years, and interfere with your day-to-day functioning, you may have PTSD.</p>"
                + "<p>Getting effective treatment after PTSD symptoms develop can be critical to reduce symptoms and improve function. Post-traumatic stress disorder symptoms may start within one month of a traumatic event, but sometimes symptoms may not appear until years after the event. These symptoms cause significant problems in social or work situations and in relationships. They can also interfere with your ability to go about your normal daily tasks.</p>"
                + "<p>PTSD symptoms are generally grouped into four types: intrusive memories, avoidance, negative changes in thinking and mood, and changes in physical and emotional reactions. Symptoms can vary over time or vary from person to person.</p>"
                + "<p><b>Intrusive memories</b><br>Symptoms of intrusive memories may include:</p>"
                + "<ul><li>Recurrent, unwanted distressing memories of the traumatic event</li>"
                + "<li>Reliving the traumatic event as if it were happening again (flashbacks)</li>"
                + "<li>Upsetting dreams or nightmares about the traumatic event</li>"
                + "<li>Severe emotional distress or physical reactions to something that reminds you of the traumatic event</li></ul>"
                + "<p><b>Avoidance</b><br>Symptoms of avoidance may include:</p>"
                + "<ul><li>Trying to avoid thinking or talking about the traumatic event</li>"
                + "<li>Avoiding places, activities or people that remind you of the traumatic event</li></ul>"
                + "<p><b>Negative changes in thinking and mood</b><br>Symptoms of negative changes in thinking and mood may include:</p>"
                + "<ul><li>Negative thoughts about yourself, other people or the world</li>"
                + "<li>Hopelessness about the future</li>"
                + "<li>Memory problems, including not remembering important aspects of the traumatic event</li>"
                + "<li>Difficulty maintaining close relationships</li>"
                + "<li>Feeling detached from family and friends</li>"
                + "<li>Lack of interest in activities you once enjoyed</li>"
                + "<li>Difficulty experiencing positive emotions</li>"
                + "<li>Feeling emotionally numb</li></ul>"
                + "<p><b>Changes in physical and emotional reactions</b><br>Symptoms of changes in physical and emotional reactions (also called arousal symptoms) may include:</p>"
                + "<ul><li>Being easily startled or frightened</li>"
                + "<li>Always being on guard for danger</li>"
                + "<li>Self-destructive behavior, such as drinking too much or driving too fast</li>"
                + "<li>Trouble sleeping</li>"
                + "<li>Trouble concentrating</li>"
                + "<li>Irritability, angry outbursts or aggressive behavior</li>"
                + "<li>Overwhelming guilt or shame</li></ul>"
                + "<p>For children 6 years old and younger, signs and symptoms may also include:</p>"
                + "<ul><li>Re-enacting the traumatic event or aspects of the traumatic event through play</li>"
                + "<li>Frightening dreams that may or may not include aspects of the traumatic event</li></ul>"
                + "<p><b>Intensity of symptoms</b></p>"
                + "<p>PTSD symptoms can vary in intensity over time. You may have more PTSD symptoms when you're stressed in general, or when you come across reminders of what you went through. For example, you may hear a car backfire and relive combat experiences. Or you may see a report on the news about a sexual assault and feel overcome by memories of your own assault.</p>"
                + "<p><b>When to see a doctor</b></p>"
                + "<p>If you have disturbing thoughts and feelings about a traumatic event for more than a month, if they're severe, or if you feel you're having trouble getting your life back under control, talk to your doctor or a mental health professional. Getting treatment as soon as possible can help prevent PTSD symptoms from getting worse.</p>";
        textViewAboutPTSD.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            Intent backIntent = new Intent(PTSDInfoActivity.this, MentalHealthInfoActivity.class);
            startActivity(backIntent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }
}