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

public class ADHDInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutADHD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhdinfo);

        background = findViewById(R.id.layout_ADHD);
        backButton = findViewById(R.id.back_button_ADHD);
        textAboutADHD = findViewById(R.id.txtAboutADHD);

        String ADHDText = "<p>Attention-deficit/hyperactivity disorder (ADHD) is a neurodevelopmental disorder, which means it shapes how the brain develops and functions. It affects the parts of the brain responsible for executive function: the ability to plan, organize, and carry out tasks. This includes being able to maintain focus and attention and being able to manage impulses and emotions.</p>\n" +
                "        \n" +
                "        <p>ADHD is typically diagnosed in childhood, but the symptoms can continue into adulthood. Some people are not diagnosed with it until later in life.</p>\n" +
                "        \n" +
                "        <p>ADHD is a medical condition that impacts work, school, relationships, and beyond. It is not caused by laziness or a lack of discipline or intelligence. People who have ADHD can (and do!) lead successful, fulfilling lives—but they may need support to manage their symptoms.</p>\n" +
                "        \n" +
                "        <p><b>What are the symptoms and signs?</b><br>ADHD symptoms typically fall into three categories:</p>\n" +
                "        \n" +
                "        <p><b>Inattention.</b> People with ADHD often have trouble paying attention to details, following instructions, and completing tasks. They may get distracted easily, struggle with organization and time management, and lose things frequently.</p>\n" +
                "        \n" +
                "        <p><b>Hyperactivity.</b> Many people with ADHD have trouble sitting still for long periods of time. They might fidget and squirm, be constantly on the go, and talk excessively.</p>\n" +
                "        \n" +
                "        <p><b>Impulsivity.</b> People with ADHD may interrupt others, act without thinking, and have difficulty waiting their turn.</p>\n" +
                "        \n" +
                "        <p>These symptoms affect people in different ways. They can vary from person to person, might change over time, and may look and feel different in various settings and for people of different ages and gender identities. Cultural beliefs and expectations can also affect how ADHD symptoms present and how they’re interpreted by others.</p>\n" +
                "        \n" +
                "        <p>If it’s not identified or is left untreated, ADHD can lead to serious challenges in school, at work, and at home. ADHD can also impact personal relationships and increase the risk of substance misuse, injuries, and accidents.</p>\n" +
                "        \n" +
                "        <p><b>What causes ADHD?</b><br>We don’t know exactly. But research suggests that several factors probably play a role. These include:</p>\n" +
                "        \n" +
                "        <p><b>Genes and heredity.</b> ADHD tends to run in families, which may mean it’s inherited. Scientists have also identified several genes that play a role in regulating brain chemicals and may contribute to ADHD development.</p>\n" +
                "        \n" +
                "        <p><b>Environment.</b> Studies have found higher rates of ADHD among people who were exposed to certain substances or conditions in the environment (such as lead and air pollution) during prenatal development or in early childhood.</p>\n" +
                "        \n" +
                "        <p><b>Brain anatomy and function.</b> Some research suggests that people with ADHD have differences in the structure and function of their brains. These differences could affect attention, impulsivity, and self-control.</p>\n" +
                "        \n" +
                "        <p><b>Who can be affected by ADHD?</b><br>Boys are more likely than girls to be diagnosed with ADHD in childhood. However, this may be due, at least in part, to differences in what ADHD symptoms look like in boys and girls.</p>\n" +
                "        \n" +
                "        <p>For example, young boys are more likely to be more physically hyperactive and impulsive, which may be more disruptive and noticeable to parents and teachers. Symptoms in young girls usually include inattentiveness and low self-esteem, which often look more subtle on the outside.</p>\n" +
                "        \n" +
                "        <p>Gender role expectations can also contribute. In many cultures, girls are expected to be quiet and well-behaved, so their inattentiveness may not be as noticeable. Many girls with ADHD also learn to conform to other people’s expectations by hiding or “masking” their struggles.</p>\n" +
                "        \n" +
                "        <p><b>Coexisting conditions</b><br>Over two-thirds of people with ADHD also have at least one other coexisting condition. These can include:</p>\n" +
                "        \n" +
                "        <ul>\n" +
                "            <li>Anxiety and mood disorders (such as depression)</li>\n" +
                "            <li>Behavioral and conduct disorders (such as difficulty following the rules)</li>\n" +
                "            <li>Learning disabilities</li>\n" +
                "            <li>Sleep problems</li>\n" +
                "            <li>Autism spectrum disorder</li>\n" +
                "        </ul>\n" +
                "        \n" +
                "        <p>Symptoms of these conditions often overlap with ADHD. This can make it hard to accurately diagnose, differentiate between, and treat them.</p>\n" +
                "        \n" +
                "        <p><b>How does ADHD affect the brain?</b><br>People with ADHD may have lower levels of dopamine, a chemical in the brain that helps regulate attention and motivation.</p>\n" +
                "        \n" +
                "        <p>Other parts of the brain that play a role include:</p>\n" +
                "        \n" +
                "        <p><b>The prefrontal cortex.</b> This is responsible for executive functions, such as planning, organizing, and paying attention. People with ADHD often have difficulty with these executive functions.</p>\n" +
                "        \n" +
                "        <p><b>The striatum.</b> This is located deep in the center of the brain and is involved in reward processing and motivation. People with ADHD may be less sensitive to rewards, which can make it harder for them to stay motivated.</p>\n" +
                "        \n" +
                "        <p><b>Neural networks.</b> People with ADHD may have differences in how certain areas of their brains communicate. This can make it difficult for them to focus and ignore distractions.</p>\n" +
                "        \n" +
                "        <p><b>How is it diagnosed?</b><br>ADHD is diagnosed based on a person’s symptoms, history, and behavior. If you or your child are experiencing symptoms of ADHD, the first step is to speak with a health care provider.</p>\n" +
                "        \n" +
                "        <p>The provider will want to know about the symptoms, including when they started, how severe they are, and how they impact aspects of life such as work, school, relationships, and daily functioning.</p>\n" +
                "        \n" +
                "        <p>They’ll also look for other possible causes. For example, certain medical conditions and other mental health conditions, as well as non-medical situations and experiences (such as a sudden life change, trauma, or an ongoing stressor), can trigger symptoms that look a lot like ADHD.</p>\n" +
                "        \n" +
                "        <p><b>How is it treated?</b><br>ADHD treatment typically involves a combination of medication, therapy, and lifestyle modification or skills training.</p>\n" +
                "        \n" +
                "        <p>Medication can help improve focus and attention in people with ADHD. Stimulants are prescribed most often, but there are also non-stimulant options available. Medication is an effective tool for many people with ADHD, but it can come with side effects, and it may take time to find the right one.</p>\n" +
                "        \n" +
                "        <p>Therapy can help people learn strategies and techniques to manage ADHD symptoms and improve their overall functioning. It can help with organization, time management, and problem-solving.</p>\n" +
                "        \n" +
                "        <p>Lifestyle modifications, including getting regular exercise, eating nutritious and balanced meals, and getting plenty of sleep, can help manage ADHD. Developing routines and schedules, setting goals, and seeking support from family, friends, and support groups are also important.</p>\n" +
                "        \n" +
                "        <p>With appropriate diagnosis, treatment, and support, people with ADHD can live successful, fulfilling lives. If you think you or your child may have ADHD, it’s important to talk to a qualified health care professional about your options.</p>";

        textAboutADHD.setText(Html.fromHtml(ADHDText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            Intent backIntent = new Intent(ADHDInfoActivity.this, MentalHealthInfoActivity.class);
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