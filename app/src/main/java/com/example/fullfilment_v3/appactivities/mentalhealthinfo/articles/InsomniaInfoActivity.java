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

public class InsomniaInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutInsomnia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insomnia_info);

        backButton  = findViewById(R.id.back_button_Insomnia);
        background = findViewById(R.id.layout_Insomnia);
        textAboutInsomnia = findViewById(R.id.txtAboutInsomnia);

        String insomniaText = "<p>Insomnia is defined as difficulty either falling or staying asleep that is accompanied by daytime impairments.</p>\n" +
                "        \n" +
                "        <p>Nighttime insomnia symptoms can include trouble sleeping and early waking. Daytime insomnia symptoms may include fatigue, impaired memory, and irritability.</p>\n" +
                "\n" +
                "        <p>There is no single established cause of insomnia, and insomnia disorders can often occur alongside other health conditions.</p>\n" +
                "\n" +
                "        <p>Insomnia is one of the most common health concerns among adults. Insomnia causes sleep issues that interfere with daily life and can be debilitating for some people. Many factors may contribute to insomnia, including stress, medications, and an individual’s sleep habits and environment.</p>\n" +
                "\n" +
                "        <p><b>What Is Insomnia?</b><br>Insomnia is a sleep disorder characterized by difficulty falling asleep, staying asleep, or both, even if you have ample time and a bedroom environment conducive to restful sleep. An insomnia diagnosis requires these sleep troubles to also cause daytime impairments, such as sleepiness or difficulty concentrating.</p>\n" +
                "\n" +
                "        <p>Up to two-thirds of people occasionally experience insomnia symptoms. These bouts of sleeplessness may or may not meet the criteria for a formal diagnosis of insomnia, depending on how long they last and whether they cause distress or interfere with daily functioning. But it is important for anyone who has concerns about their sleep to discuss them with a health professional for proper diagnosis and treatment.</p>\n" +
                "\n" +
                "        <p>A doctor can ask questions to better understand your situation and order tests to determine if an insomnia diagnosis is appropriate. Symptoms of insomnia can overlap with symptoms of other sleep disorders, so it is important to work with a professional rather than attempting to self-diagnose.</p>\n" +
                "\n" +
                "        <p>Insomnia that goes untreated, leading to long-term sleep deprivation, is linked with a number of harmful effects, including lower quality of life and increased risk for substance abuse, chronic pain, heart disease, and diabetes.</p>\n" +
                "\n" +
                "        <p><b>Types of Insomnia</b><br>The two main types of insomnia are acute insomnia and chronic insomnia. Acute insomnia describes sleep difficulties that last for a few days or weeks, but not longer than three months. Short-term insomnia can often be traced to an external cause or life stressor like divorce, the death of a loved one, or a major illness. If acute insomnia persists over multiple months, it becomes classified as chronic insomnia.</p>\n" +
                "\n" +
                "        <p>Chronic insomnia is when a person experiences sleeping difficulties and related daytime symptoms, like sleepiness and attention issues, at least three days per week for longer than three months. It is estimated that about 10% to 15% of people have chronic insomnia.</p>\n" +
                "\n" +
                "        <p>People with chronic insomnia commonly feel distressed about their inability to sleep and the daytime symptoms caused by those sleep issues. Symptoms are generally severe enough to affect a person’s work or school performance as well as their social or family life.</p>\n" +
                "\n" +
                "        <p><b>Symptoms of Insomnia</b><br>The symptoms of insomnia include various sleep-related difficulties and daytime problems. Common sleep issues that can signal the presence of insomnia include:</p>\n" +
                "        <ul>\n" +
                "            <li>Trouble falling asleep</li>\n" +
                "            <li>Trouble staying asleep throughout the night</li>\n" +
                "            <li>Unwanted early morning waking</li>\n" +
                "            <li>Resisting sleeping at bedtime in children and teens</li>\n" +
                "            <li>Difficulty sleeping without a caregiver’s help in children and teens</li>\n" +
                "        </ul>\n" +
                "        \n" +
                "        <p>In addition, insomnia causes daytime symptoms related to sleep loss. Those with insomnia often report feeling fatigued during waking hours, which may lead to impaired attention or memory. Insomnia-related sleepiness can affect work, school or social performance, and increase the risk of accidents. Insomnia has the potential to negatively influence behavioral health and may contribute to instances of irritability, hyperactivity, or aggressiveness, especially in children.</p>\n" +
                "\n" +
                "        <p><b>What Causes Insomnia?</b><br>There is no main cause of insomnia. However, research suggests that in many people insomnia likely results from certain types of physiological arousal at unwanted times, disrupting normal patterns of sleep. Examples of such arousal can include a heightened heart rate, a higher body temperature, and increased levels of specific hormones, like cortisol.</p>\n" +
                "\n" +
                "        <p>A person’s family history, age, and gender may also play a role in their susceptibility to insomnia. Additionally, insomnia disorders often occur alongside mental health disorders, including depression and anxiety. It is believed that the cause of insomnia may be distinct in people who have both insomnia and mental health conditions.</p>\n" +
                "\n" +
                "        <p><b>Risk Factors for Insomnia</b><br>While there is no single cause of insomnia, studies have identified factors that can put a person at a greater risk for experiencing insomnia. These include, but are not limited to:</p>\n" +
                "        <ul>\n" +
                "            <li>Being a woman or assigned female at birth</li>\n" +
                "            <li>Older age</li>\n" +
                "            <li>Lower socioeconomic status</li>\n" +
                "            <li>Medical conditions like diabetes and chronic pain</li>\n" +
                "            <li>Other sleep disorders such as restless legs syndrome and sleep apnea</li>\n" +
                "            <li>Mood disorders including depression and anxiety</li>\n" +
                "            <li>Having an immediate family member with insomnia</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>It is important to note that not everyone who has one or more of these risk factors will have insomnia, and not everyone with insomnia will have one of these risk factors.</p>\n" +
                "\n" +
                "        <p><b>How Is Insomnia Diagnosed?</b><br>Doctors generally diagnose insomnia by evaluating a person’s sleep habits and medical history.</p>\n" +
                "\n" +
                "        <p>Typically, a patient’s description of their symptoms informs their insomnia diagnosis. A doctor may instruct patients to keep a sleep diary for a week or more, which can provide insight about a person’s sleep duration, perceived sleep quality, and lifestyle choices that may contribute to sleep problems. Other self-reporting diagnostic tools, including the Pittsburgh Sleep Quality Index, may be used by medical professionals in a clinical setting to determine the severity of insomnia symptoms.</p>\n" +
                "\n" +
                "        <p>If a doctor needs to rule out other sleep disorders that could be causing a person’s symptoms, other assessments, such as a sleep study, may be ordered.</p>\n" +
                "\n" +
                "        <p><b>Treatments for Insomnia</b><br>Treatment for insomnia depends on how long a person has been experiencing sleep issues and any specific factors that are contributing to their sleep loss. If insomnia is associated with another condition, such as sleep apnea or depression, treatment of the other condition often improves sleep.</p>\n" +
                "\n" +
                "        <p>It is important to get help with insomnia sooner than later. For people with short-term insomnia, care may be focused on discussing practices to support sleep hygiene. Temporary use of a prescription sleep aid may be an option if the insomnia is causing high levels of concern or distress.</p>\n" +
                "\n" +
                "        <p>A few treatment approaches are available for people with insomnia that persists for weeks or months.</p>\n" +
                "\n" +
                "        <p><b>Cognitive Behavioral Therapy for Insomnia (CBT-I)</b><br>Experts consider cognitive behavioral therapy for insomnia (CBT-I) to be the most effective initial treatment for chronic insomnia. CBT-I helps people manage anxiety they feel about their sleep issues and establish better sleep habits.</p>\n" +
                "\n" +
                "        <p><b>Sleep Medications</b><br>If a person experiences significant symptoms from insomnia, or in cases where CBT-I does not help, medication may be recommended. Medication can help promote sleep but may also come with side effects, such as daytime drowsiness or confusion.</p>\n" +
                "\n" +
                "        <p><b>Homeopathic Treatments</b><br>Some people with insomnia may be interested in exploring other options, such as melatonin or dietary supplements, yoga, hypnosis, or aromatherapy. However, scientific evidence supporting the use of these methods to treat insomnia is lacking at this time.</p>\n" +
                "\n" +
                "        <p>Insomnia is a real illness and help is available. With proper diagnosis and treatment, the vast majority of people with insomnia can overcome it. If you are experiencing symptoms of insomnia, a first step is to see your family physician or a sleep specialist. Talk about your concerns and request a thorough evaluation.</p>";

        textAboutInsomnia.setText(Html.fromHtml(insomniaText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(InsomniaInfoActivity.this, MentalHealthInfoActivity.class);
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