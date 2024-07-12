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

public class BipolarDisorderInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textAboutBipolarDisorder;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bipolar_disorder_info);

        background = findViewById(R.id.layout_Bipolar_Disorder);
        textAboutBipolarDisorder = findViewById(R.id.txtAboutBipolarDisorder);
        backButton = findViewById(R.id.back_button_Bipolar_Disorder);

        String bipolarDisorderText = " <p>We all experience shifts in our moods at times. However, some people feel changes in mood differently. For people with bipolar disorder, experiencing heightened emotions and depressive states are often so intense that they interfere with everyday life.</p>\n" +
                "\n" +
                "        <p>Bipolar disorder (BD) is both common and treatable.</p>\n" +
                "\n" +
                "        <p>If you or someone you love has BD, a thoughtful and informed support system can help ensure symptoms are successfully managed.</p>\n" +
                "\n" +
                "        <p><b>Keep Reading To Learn</b></p>\n" +
                "        <ul>\n" +
                "            <li>The truth about bipolar disorder</li>\n" +
                "            <li>How to recognize BD in yourself or others</li>\n" +
                "            <li>How to successfully manage and treat it</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><b>Understanding Bipolar Disorder</b><br>Previously called manic depression or manic-depressive illness, bipolar disorder (BD) is a serious mental health condition that leads to shifts in mood. It consists of depressive states as well as episodes of mania.</p>\n" +
                "\n" +
                "        <p>During manic episodes, people feel as if they are on a “high” and have extreme amounts of energy. In depressive episodes, people experience feelings of sadness or indifference.</p>\n" +
                "\n" +
                "        <p>In addition to changing moods, bipolar disorder causes shifts in focus and activity levels. People with untreated BD can struggle with carrying out daily tasks.</p>\n" +
                "\n" +
                "        <p>Approximately 10 million people in the U.S. have bipolar disorder. It impacts men and women equally.</p>\n" +
                "\n" +
                "        <p>BD can impact sleep, self-esteem, appetite, and concentration. People with bipolar disorder can also have physical health issues, such as migraines, high blood pressure, and heart attacks.</p>\n" +
                "\n" +
                "        <p>There are different types of bipolar disorders and like every individual living with it, the condition can impact each person differently.</p>\n" +
                "\n" +
                "        <p><b>There Are Various Types of Bipolar Disorders</b><br>Though every form of BD leads to mood and energy level shifts, each type of bipolar disorder has its own characteristics.</p>\n" +
                "\n" +
                "        <p><b>Bipolar I</b><br>Bipolar I is the “classic” type of bipolar disorder with both manic and depressive episodes present. Bipolar I is characterized by one or more manic episode that lasts for at least seven days or leads someone to seek medical care.</p>\n" +
                "\n" +
                "        <p>A manic episode involves very elevated or irritable mood. It may include increased energy, decreased need for sleep, racing thoughts, increased self-esteem, rapid speech, and changes in things like appetite and concentration.</p>\n" +
                "\n" +
                "        <p>People with bipolar I may also experience episodes of depression. Sometimes people experience both depressive and manic symptoms at the same time, which is called a “mixed episode.”</p>\n" +
                "\n" +
                "        <p>Some people with BD also experience symptoms of psychosis during a manic or depressive episode. Psychosis, or loss of contact with reality, leads the person to be unsure of what’s real and what’s not.</p>\n" +
                "\n" +
                "        <p>Symptoms of psychosis include unusual beliefs or perceptions, like believing things that are not true or seeing or hearing things that others don’t.</p>\n" +
                "\n" +
                "        <p>Both manic and depressive episodes represent distinct changes in a person’s mood and behavior that negatively impact daily life functioning.</p>\n" +
                "\n" +
                "        <p><b>Bipolar II</b><br>Bipolar II is defined by episodes of hypomania, or an unusually energetic state of mind that affects mood, thoughts, and behaviors. The manic episodes are not as severe as in bipolar I. They may also be shorter in duration than manic episodes in bipolar I.</p>\n" +
                "\n" +
                "        <p>While less commonly experienced than in bipolar I, folks with bipolar II disorder may also experience psychosis.</p>\n" +
                "\n" +
                "        <p><b>Cyclothymic Disorder</b><br>Also called cyclothymia, folks with this condition tend to move between episodes of depression and mania more quickly. The symptoms do not meet the criteria for bipolar I or bipolar II. There are still episodes of depression and episodes of mania.</p>\n" +
                "\n" +
                "        <p><b>Bipolar Disorder in Children and Teens Is Not Uncommon</b><br>Bipolar disorder is typically diagnosed during later teen years or early adulthood. However, symptoms of BD can often show up in young children.</p>\n" +
                "\n" +
                "        <p>It can be difficult to tell whether teens are experiencing normal mood swings or showing signs of a serious mental health condition.</p>\n" +
                "\n" +
                "        <p>It’s important for parents, caregivers, friends, and family members to watch for mood swings that differ from typical behavior. Behavioral changes can be a sign of the onset of a mental health concern.</p>\n" +
                "\n" +
                "        <p>The most important thing to do if you are concerned is to ask for help. Even if the child is not diagnosed with bipolar disorder, there may be another mental health issue that needs to be addressed.</p>\n" +
                "\n" +
                "        <p><b>What Causes Bipolar Disorder?</b><br>In order to watch for signs of BD, it is important to understand who is at risk. Even though the exact cause of bipolar disorder is still being researched, there are a number of factors that contribute to a diagnosis.</p>\n" +
                "\n" +
                "        <p><b>Changes in Brain Structure and Functioning</b><br>The overall structure and function of the brain are different in people who have the condition. It is possible that the way neurotransmitters pass between neurons contributes to the development of the condition.</p>\n" +
                "\n" +
                "        <p><b>Genetics</b><br>Someone’s family history could play a role in the diagnosis of bipolar disorder. People who have one or more family members, particularly a parent or a sibling, with a diagnosis of BD are more at risk. Many genes are involved, and this is still an active area of research.</p>\n" +
                "\n" +
                "        <p><b>Coexisting Mental Health Issues</b><br>People who have another mental health issue are more likely to develop bipolar disorder. These often include conditions such as depression or anxiety.</p>\n" +
                "\n" +
                "        <p><b>Recognizing Bipolar Disorder in Yourself or Others</b><br>Just like each person looks different, the condition can vary from person to person.</p>\n" +
                "\n" +
                "        <p>It is important to understand how bipolar disorder tends to present. It’s not like a light switch of emotions, as many believe it to be. Symptoms of mania or depression may appear over the span of days, weeks, or even longer.</p>\n" +
                "\n" +
                "        <p>Some episodes may last for a day or two while others may last for a week or longer.</p>\n" +
                "\n" +
                "        <p>To understand BD, it’s important to understand the signs of manic and depressive episodes.</p>\n" +
                "\n" +
                "        <p><b>Some signs that someone is experiencing a manic episode include:</b></p>\n" +
                "        <ul>\n" +
                "            <li>Feeling elated, high, or “up”</li>\n" +
                "            <li>Feeling extremely irritable</li>\n" +
                "            <li>A decreased need for sleep, sometimes going several days without sleep at all without feeling tired</li>\n" +
                "            <li>Changes in appetite</li>\n" +
                "            <li>Bouncing quickly between thoughts</li>\n" +
                "            <li>Risky behavior and poor judgment, such as spending large amounts of money, drinking excessively, or risky sexual behavior</li>\n" +
                "            <li>“Grandiose” ideas where the person feels exceptionally talented, important, or powerful</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>Since a manic episode can involve feelings of euphoria, it’s not unusual for people experiencing mania to want the feeling to last forever. This also explains why many who are experiencing episodes of mania may not ask for help. However, the feeling of mania will end.</p>\n" +
                "\n" +
                "        <p>Some people with BD will also experience one or more depressive episodes. They may have symptoms similar to major depressive disorder (MDD). Some of the most common symptoms include:</p>\n" +
                "        <ul>\n" +
                "            <li>Feeling sad, hopeless, or worried most of the day, almost every day</li>\n" +
                "            <li>Taking longer than normal to complete daily tasks</li>\n" +
                "            <li>Loss of interest or pleasure in things they usually enjoy</li>\n" +
                "            <li>Major changes in sleep habits, either sleeping significantly more or sleeping significantly less than usual</li>\n" +
                "            <li>Major changes in appetite, eating more or less than usual</li>\n" +
                "            <li>Speaking slowly, with the impression that they are having a hard time getting the words out of their mouth</li>\n" +
                "            <li>Difficulty concentrating</li>\n" +
                "            <li>Taking a long time to complete simple tasks</li>\n" +
                "            <li>Losing all interest in activities that once brought joy or pleasure</li>\n" +
                "            <li>Thoughts of death or suicide</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>Like manic episodes, depressive episodes eventually end. That said, sometimes the individual may go back to a state of mania.</p>\n" +
                "\n" +
                "        <p>It is also possible for people with BD to experience an episode that has mixed features of mania and depression. People who have such mixed states often have more serious and frequent symptoms.</p>\n" +
                "\n" +
                "        <p>Manic episodes and depressive episodes can vary in their degrees of severity. This is especially the case with bipolar II or cyclothymia.</p>\n" +
                "\n" +
                "        <p>It’s important to note that pregnancy can trigger the first episodes of bipolar disorder in women who are of childbearing age.</p>\n" +
                "\n" +
                "        <p>In some situations, people may not be able to go to school or work. In others, people may be able to continue daily activities even though they are experiencing serious symptoms.</p>\n" +
                "\n" +
                "        <p>Without proper treatment, it is possible for these episodes to get worse over time. For example, episodes of hypomania may become episodes of full-blown mania if they are not taken seriously. For all of these reasons, people with bipolar disorder should seek help from a trained mental health professional.</p>\n" +
                "\n" +
                "        <p>Even though symptoms can fluctuate over time, bipolar disorder usually requires lifelong treatment. It is possible for people to manage symptoms and improve their overall quality of life.</p>\n" +
                "\n" +
                "        <p><b>Bipolar Disorder and Other Mental Illnesses</b><br>People with bipolar disorder fluctuate between mania and depression. Because it can look like other illnesses, it can be difficult to diagnose.</p>\n" +
                "\n" +
                "        <p>Folks diagnosed with BD may experience another mental illness at the same time. Possibilities include eating disorders, anxiety disorders, or substance use disorders.</p>\n" +
                "\n" +
                "        <p>People with bipolar disorder have an increased risk of developing other chronic medical conditions including diabetes, obesity, migraine headaches, thyroid disease, and heart disease.</p>\n" +
                "\n" +
                "        <p>Below are just a few of the most common conditions that may look like bipolar disorder or may manifest as additional diagnoses. Anyone who has symptoms of these conditions should seek help from a trained medical professional, mental health professional, or specialist.</p>\n" +
                "\n" +
                "        <p><b>Psychosis</b><br>It is possible for someone with bipolar disorder to experience psychotic symptoms. Psychosis refers to hearing or seeing something that is not there, known as hallucinations. Or the person may have beliefs that cannot be true, known as delusions.</p>\n" +
                "\n" +
                "        <p>For example, people experiencing mania may falsely believe that they have an endless supply of money, special powers, or that they are the most famous person in the world. During episodes of depression, people with BD may falsely believe that they have no money at all, have committed a heinous crime, or that they have a serious illness that no one is able to diagnose.</p>\n" +
                "\n" +
                "        <p>Because of these psychotic symptoms, it is possible for someone with bipolar disorder to be misdiagnosed with schizophrenia. However, someone with schizophrenia must have symptoms of psychosis that are separate from manic and depressive episodes.</p>\n" +
                "\n" +
                "        <p><b>Anxiety</b><br>It is not unusual for someone with BD to also be diagnosed with anxiety. There are many types of anxiety disorders, including social anxiety and generalized anxiety.</p>\n" +
                "\n" +
                "        <p>It is also possible for people with bipolar disorder to experience panic attacks. Panic attacks are episodes of rising heart rate, sweating, and rapid breathing. People may also experience feelings of impending doom during a panic attack.</p>\n" +
                "\n" +
                "        <p><b>ADHD</b><br>People with bipolar disorder may have attention-deficit/hyperactivity disorder (ADHD). If someone is diagnosed with BD during their adult years, it is possible they may have outgrown ADHD during their childhood. In order for someone to be diagnosed with ADHD, they need to have symptoms of hyperactivity and symptoms of attention-deficit.</p>\n" +
                "\n" +
                "        <p><b>Eating Disorders</b><br>It is possible for people with bipolar disorder to be diagnosed with an eating disorder as well. The most common examples include anorexia, bulimia, and binge eating disorder. Rapid changes in appetite may also be a sign of depression or other conditions.</p>\n" +
                "\n" +
                "        <p><b>Substance Use Disorders</b><br>It is not unusual for people with bipolar disorder to be diagnosed with substance use disorders. For example, people with BD may misuse alcohol or drugs as a means to cope with their symptoms.</p>\n" +
                "\n" +
                "        <p>They may also engage in other risky behaviors that are more common during manic episodes. It is critical for someone with a substance use disorder to be screened for BD.</p>";

        textAboutBipolarDisorder.setText(Html.fromHtml(bipolarDisorderText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(BipolarDisorderInfoActivity.this, MentalHealthInfoActivity.class);
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