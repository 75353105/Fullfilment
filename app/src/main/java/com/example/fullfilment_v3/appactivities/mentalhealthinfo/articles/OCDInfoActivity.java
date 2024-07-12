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

public class OCDInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutOCD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocdinfo);

        background = findViewById(R.id.layout_OCD);
        backButton = findViewById(R.id.back_button_OCD);
        textAboutOCD = findViewById(R.id.txtAboutOCD);

        String OCDText = "Obsessive-compulsive disorder (OCD) is a disorder in which people have recurring, unwanted thoughts, ideas or sensations (obsessions). To get rid of the thoughts, they feel driven to do something repetitively (compulsions). The repetitive behaviors, such as hand washing/cleaning, checking on things, and mental acts like counting or other activities, can significantly interfere with a person’s daily activities and social interactions.</p>\n" +
                "\n" +
                "        <p>Many people without OCD have distressing thoughts or repetitive behaviors. However, these do not typically disrupt daily life. For people with OCD, thoughts are persistent and intrusive, and behaviors are rigid. Not performing the behaviors commonly causes great distress, often attached to a specific fear of dire consequences (to self or loved ones) if the behaviors are not completed. Many people with OCD know or suspect their obsessional thoughts are not realistic; others may think they could be true. Even if they know their intrusive thoughts are not realistic, people with OCD have difficulty disengaging from the obsessive thoughts or stopping the compulsive actions.</p>\n" +
                "\n" +
                "        <p>A diagnosis of OCD requires the presence of obsessional thoughts and/or compulsions that are time-consuming (more than one hour a day), cause significant distress, and impair work or social functioning. OCD affects 2-3% of people in the United States, and among adults, slightly more women than men are affected. OCD often begins in childhood, adolescence, or early adulthood. Some people may have some symptoms of OCD but not meet full criteria for this disorder.</p>\n" +
                "\n" +
                "        <p><b>Obsessions</b><br>Obsessions are recurrent and persistent thoughts, impulses, or images that cause distressing emotions such as anxiety, fear or disgust. Many people with OCD recognize that these are a product of their mind and that they are excessive or unreasonable. However, the distress caused by these intrusive thoughts cannot be resolved by logic or reasoning. Most people with OCD try to ease the distress of the obsessional thinking, or to undo the perceived threats, by using compulsions. They may also try to ignore or suppress the obsessions or distract themselves with other activities.</p>\n" +
                "\n" +
                "        <p>Examples of common content of obsessional thoughts:</p>\n" +
                "        <ul>\n" +
                "            <li>Fear of contamination by people or the environment</li>\n" +
                "            <li>Disturbing sexual thoughts or images</li>\n" +
                "            <li>Religious, often blasphemous, thoughts or fears</li>\n" +
                "            <li>Fear of perpetrating aggression or being harmed (self or loved ones)</li>\n" +
                "            <li>Extreme worry something is not complete</li>\n" +
                "            <li>Extreme concern with order, symmetry, or precision</li>\n" +
                "            <li>Fear of losing or discarding something important</li>\n" +
                "            <li>Seemingly meaningless thoughts, images, sounds, words or music</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><b>Compulsions</b><br>Compulsions are repetitive behaviors or mental acts that a person feels driven to perform in response to an obsession. The behaviors typically prevent or reduce a person's distress related to an obsession temporarily, and they are then more likely to do the same in the future. Compulsions may be excessive responses that are directly related to an obsession (such as excessive hand washing due to the fear of contamination) or actions that are completely unrelated to the obsession. In the most severe cases, a constant repetition of rituals may fill the day, making a normal routine impossible.</p>\n" +
                "\n" +
                "        <p>Examples of compulsions:</p>\n" +
                "        <ul>\n" +
                "            <li>Excessive or ritualized hand washing, showering, brushing teeth, or toileting</li>\n" +
                "            <li>Repeated cleaning of household objects</li>\n" +
                "            <li>Ordering or arranging things in a particular way</li>\n" +
                "            <li>Repeatedly checking locks, switches, appliances, doors, etc.</li>\n" +
                "            <li>Constantly seeking approval or reassurance</li>\n" +
                "            <li>Rituals related to numbers, such as counting, repeating, excessively preferencing or avoiding certain numbers</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>People with OCD may also avoid certain people, places, or situations that cause them distress and trigger obsessions and/or compulsions. Avoiding these things may further impair their ability to function in life and may be detrimental to other areas of mental or physical health.</p>\n" +
                "\n" +
                "        <p><b>Treatment</b><br>Patients with OCD who receive appropriate treatment commonly experience increased quality of life and improved functioning. Treatment may improve an individual's ability to function at school and work, develop and enjoy relationships, and pursue leisure activities.</p>\n" +
                "\n" +
                "        <p><b>Cognitive Behavioral Therapy</b><br>One effective treatment is a type of cognitive-behavioral therapy (CBT) known as exposure and response prevention (ERP). During treatment sessions, patients are exposed to feared situations or images that focus on their obsessions. Although it is standard to start with those that only lead to mild or moderate symptoms, initially the treatment often causes increased anxiety. Patients are instructed to avoid performing their usual compulsive behaviors (known as response prevention). By staying in a feared situation without anything terrible happening, patients learn that their fearful thoughts are just thoughts. People learn that they can cope with their thoughts without relying on ritualistic behaviors, and their anxiety decreases over time. Using evidence-based guidelines, therapists and patients typically collaborate to develop an exposure plan that gradually moves from lower anxiety situations to higher anxiety situations. Exposures are performed both in treatment sessions and at home. Some people with OCD may not agree to participate in CBT because of the initial anxiety it evokes, but it is the most powerful tool available for treating many types of OCD.</p>\n" +
                "\n" +
                "        <p><b>Medication</b><br>A class of medications known as selective serotonin reuptake inhibitors (SSRIs), typically used to treat depression, can also be effective in the treatment of OCD. The SSRI dosage used to treat OCD is often higher than that used to treat depression. Patients who do not respond to one SSRI medication sometimes respond to another. The maximum benefit usually takes six to twelve weeks or longer to be fully visible. Patients with mild to moderate OCD symptoms are typically treated with either CBT or medication depending on patient preference, the patient’s cognitive abilities and level of insight, the presence or absence of associated psychiatric conditions, and treatment availability. The best treatment of OCD is a combination of CBT and SSRIs, especially if OCD symptoms are severe.</p>\n" +
                "\n" +
                "        <p><b>Neurosurgical treatment</b><br>Some newer studies show that gamma ventral capsulotomy, a surgical procedure, can be very effective for patients who do not respond to typical treatments and are very impaired, but it is underused due to historical prejudice and its invasiveness. Deep brain stimulation, which involves an implanted device in the brain, has data to support efficacy and does not permanently destroy brain tissue as done in a capsulotomy. However, it is still highly invasive and complex to manage, and there are limited providers and hospital systems trained to offer this treatment and, able to provide the long-term support needed by DBS patients.</p>\n" +
                "\n" +
                "        <p><b>How to Support a Loved One Struggling with OCD</b><br>In people with OCD who live with family, friends, or caregivers, enlisting their support to help with exposure practice at home is recommended. In fact, the participation of family and friends is a predictor of treatment success.</p>\n" +
                "\n" +
                "        <p><b>Self-care</b><br>Maintaining a healthy lifestyle can help in coping with OCD. Getting enough good quality sleep, eating healthy food, exercising, and spending time with others can help with overall mental health. Also, using basic relaxation techniques (when not doing exposure exercises) such as meditation, yoga, visualization, and massage can help ease the stress and anxiety.</p>";

        textAboutOCD.setText(Html.fromHtml(OCDText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(OCDInfoActivity.this, MentalHealthInfoActivity.class);
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