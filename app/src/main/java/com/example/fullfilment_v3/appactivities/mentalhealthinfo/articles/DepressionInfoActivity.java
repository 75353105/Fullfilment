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

public class DepressionInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutDepression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_info);

        background = findViewById(R.id.layout_Depression);
        backButton = findViewById(R.id.back_button_Depression);
        textAboutDepression = findViewById(R.id.txtAboutDepression);

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(DepressionInfoActivity.this, MentalHealthInfoActivity.class);
            startActivity(backIntent);
        });

        String depressionText = "<p>Depression (major depressive disorder) is a common and serious mental disorder that negatively affects how you feel, think, act, and perceive the world.</p>\n" +
                "\n" +
                "        <p>Nearly three in ten adults (29%) have been diagnosed with depression at some point in their lives and about 18% are currently experiencing depression, according to a 2023 national survey. Women are more likely than men and younger adults are more likely than older adults to experience depression. While depression can occur at any time and at any age, on average it can first appear during one’s late teens to mid-20s.</p>\n" +
                "\n" +
                "        <p>Symptoms of depression symptoms can vary from mild to severe and can appear differently in each person. These symptoms can include:</p>\n" +
                "\n" +
                "        <p><b>Feeling sad, irritable, empty and/or hopeless.</b></p>\n" +
                "        <p><b>Losing interest or pleasure in activities you once enjoyed.</b></p>\n" +
                "        <p><b>A significant change in appetite (eating much less or more than usual) and/or weight (notable loss or gain unrelated to dieting).</b></p>\n" +
                "        <p><b>Sleeping too little or too much.</b></p>\n" +
                "        <p><b>Decreased energy or increased tiredness or fatigue</b></p>\n" +
                "        <p><b>Increase in purposeless physical activity (e.g., inability to sit still, pacing, handwringing) or slowed movements or speech that are severe enough to be observable by others.</b></p>\n" +
                "        <p><b>Feeling worthless or excessively guilty.</b></p>\n" +
                "        <p><b>Difficulty thinking or concentrating, forgetfulness, and/or difficulty making minor decisions.</b></p>\n" +
                "        <p><b>Thoughts of death, suicidal ideation, or suicide attempts.</b></p>\n" +
                "\n" +
                "        <p>It is normal to experience moments of sadness or feeling “down in the dumps” or the blues as part of the human experience. However, a diagnosis of depression requires that the above symptoms occur for most of the day, nearly every day, for more than two weeks, along with a clear change in day-to-day functioning (e.g., in work/school performance, personal relationships, and hobbies). Fortunately, depression is very treatable.</p>\n" +
                "\n" +
                "        <p><b>Risk Factors for Depression</b><br>Depression can affect anyone—even those who seemingly have it all. Several factors can play a role in depression:</p>\n" +
                "\n" +
                "        <p><b>Biochemical:</b> Differences in certain chemicals in the brain (such as the neurotransmiters serotonin, dopamine and norepinephrine) may contribute to symptoms of depression.</p>\n" +
                "        <p><b>Genetic:</b> Depression can run in families. For example, if one identical twin has depression, the other has a 70 percent chance of having the illness sometime in life.</p>\n" +
                "        <p><b>Personality:</b> People with low self-esteem, who are easily overwhelmed by stress, or who are generally pessimistic may be more likely to experience depression.</p>\n" +
                "        <p><b>Environmental:</b> Continuous exposure to violence, neglect, abuse or poverty can also pose risks for developing depression.</p>\n" +
                "\n" +
                "        <p><b>How Is Depression Treated?</b><br>Depression is among the most treatable of mental disorders. Between 70% and 90% percent of people with depression eventually respond well to treatment.</p>\n" +
                "\n" +
                "        <p>To diagnose depression, a healthcare professional will conduct a thorough diagnostic evaluation that includes a comprehensive interview to discuss your symptoms in addition to your personal, medical and family histories. Moreover, a physical examination should be performed to screen for underlying medical conditions that may mimic depression — such as hormonal imbalances, vitamin deficiencies, neurological problems and drug or alcohol use. Laboratory and imaging tests may also be included in the evaluation as part of the medical screening. The evaluating medical professional will take all of these factors into account as they formulate a diagnosis and recommend an individualized treatment plan.</p>\n" +
                "\n" +
                "        <p><b>Medication</b><br>Brain chemistry may contribute to an individual’s depression and may factor into their treatment. For this reason, antidepressants may be recommended. These medications are not sedatives, “uppers” or tranquilizers. They are not addictive.</p>\n" +
                "\n" +
                "        <p>Antidepressants may produce some improvement within the first week or two of use yet full benefits may not be seen for two to three months. If a person feels little or no improvement after several weeks, their psychiatrist/healthcare professional may recommend adjusting the dose, adding a new medication, or switching to an alternate antidepressant. In some situations, other classes of psychiatric medications, such as mood stabilizers, may be helpful. It is important to let your healthcare professional know if you have concerns about your mediation(s) or experience any side effects of the medication.</p>\n" +
                "\n" +
                "        <p>Psychiatrists usually recommend that patients continue to take medication for six or more months after the depressive symptoms have improved. For certain people at risk — for example, those who have experienced multiple episodes of depression in the past, or those with a strong family history of depression — longer-term maintenance treatment may be suggested to decrease the risk of future episodes.</p>\n" +
                "\n" +
                "        <p><b>Psychotherapy</b><br>Psychotherapy, or “talk therapy,” is also often recommended. Cognitive behavioral therapy (CBT), one of the most common forms of psychotherapy, has been found to be effective in treating depression. CBT focuses on recognizing and correcting unhealthy thinking patterns with the goal of changing thoughts and behaviors to respond to challenges in a more positive manner. It may be used alone or in combination with antidepressant medication.</p>\n" +
                "\n" +
                "        <p>Psychotherapy may involve one or more people. For example, family or couples therapy can help address issues within these close relationships. Group therapy brings together, in a therapeutic environment, a cohort of people who are similarly experiencing depression, providing an opportunity for mutual learning and support.</p>\n" +
                "\n" +
                "        <p>Depending on the severity of the depression, treatment with psychotherapy can last a few weeks or longer. Significant improvement can aften be made in 10 to 15 sessions.</p>\n" +
                "\n" +
                "        <p><b>Electroconvulsive Therapy (ECT)</b><br>ECT is a medical treatment that is generally reserved for those with severe depressive episodes who have not responded to other treatments. ECT has been used since the 1940s, and many years of research have led to major improvements and the recognition of its effectiveness as a mainstream rather than a \"last resort\" treatment. ECT is a procedure performed under anesthesia during which the brain is stimulated electrically to induce a brief seizure. A  patient typically receives ECT two to three times a week for a total of six to 12 treatments. It is usually managed by a team of trained medical professionals including a psychiatrist, an anesthesiologist and a nurse or physician assistant.</p>\n" +
                "\n" +
                "        <p><b>Self-help and Coping</b><br>There are a number of things people can do to help reduce the symptoms of depression. For many people, regular exercise helps create positive feeling and improves mood. Getting enough quality sleep on a regular basis, eating a healthy diet and avoiding alcohol (a depressant) can also help reduce symptoms of depression.</p>\n";

        textAboutDepression.setText(Html.fromHtml(depressionText, Html.FROM_HTML_MODE_COMPACT));
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences settings = getSharedPreferences("Background", Context.MODE_PRIVATE);
        int backgroundId = settings.getInt("background", R.drawable.fundal_welcome_gradient);
        background.setBackgroundResource(backgroundId);
    }
}