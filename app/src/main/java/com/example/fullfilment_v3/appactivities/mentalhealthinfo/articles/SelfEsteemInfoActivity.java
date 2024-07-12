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

public class SelfEsteemInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textViewAboutSelfEsteem;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_esteem_info);

        background  = findViewById(R.id.layout_self_esteem);
        backButton = findViewById(R.id.back_button_SelfEsteem);
        textViewAboutSelfEsteem = findViewById(R.id.txtAboutSelfEsteem);

        String selfEsteemText =
                "        <p>Self-esteem is your subjective sense of overall personal worth or value. Similar to self-respect, it describes your level of confidence in your abilities and attributes.</p>\n" +
                "\n" +
                "        <p>Having healthy self-esteem can influence your motivation, your mental well-being, and your overall quality of life. However, having self-esteem that is either too high or too low can be problematic. Better understanding what your unique level of self-esteem is can help you strike a balance that is just right for you.</p>\n" +
                "\n" +
                "        <p>Key elements of self-esteem include:</p>\n" +
                "        <ul>\n" +
                "            <li>Self-confidence</li>\n" +
                "            <li>Feelings of security</li>\n" +
                "            <li>Identity</li>\n" +
                "            <li>Sense of belonging</li>\n" +
                "            <li>Feeling of competence</li>\n" +
                "        </ul>\n" +
                "        <p>Other terms often used interchangeably with self-esteem include self-worth, self-regard, and self-respect.</p>\n" +
                "\n" +
                "        <p>Self-esteem tends to be lowest in childhood and increases during adolescence, as well as adulthood, eventually reaching a fairly stable and enduring level. This makes self-esteem similar to the stability of personality traits over time.</p>\n" +
                "\n" +
                "        <p><b>Why Self-Esteem Is Important</b><br>Self-esteem impacts your decision-making process, your relationships, your emotional health, and your overall well-being. It also influences motivation, as people with a healthy, positive view of themselves understand their potential and may feel inspired to take on new challenges.</p>\n" +
                "\n" +
                "        <p>Four key characteristics of healthy self-esteem are:</p>\n" +
                "        <ul>\n" +
                "            <li>A firm understanding of one's skills</li>\n" +
                "            <li>The ability to maintain healthy relationships with others as a result of having a healthy relationship with oneself</li>\n" +
                "            <li>Realistic and appropriate personal expectations</li>\n" +
                "            <li>An understanding of one's needs and the ability to express those needs</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>People with low self-esteem tend to feel less sure of their abilities and may doubt their decision-making process. They may not feel motivated to try novel things because they don’t believe they can reach their goals. Those with low self-esteem may have issues with relationships and expressing their needs. They may also experience low levels of confidence and feel unlovable and unworthy.</p>\n" +
                "\n" +
                "        <p>People with overly high self-esteem may overestimate their skills and may feel entitled to succeed, even without the abilities to back up their belief in themselves. They may struggle with relationship issues and block themselves from self-improvement because they are so fixated on seeing themselves as perfect.</p>\n" +
                "\n" +
                "        <p><b>Theories of Self-Esteem</b><br>Many theorists have written about the dynamics involved in the development of self-esteem. The concept of self-esteem plays an important role in psychologist Abraham Maslow's hierarchy of needs, which depicts esteem as one of the basic human motivations.</p>\n" +
                "\n" +
                "        <p>Maslow suggested that individuals need both appreciation from other people and inner self-respect to build esteem. Both of these needs must be fulfilled in order for an individual to grow as a person and reach self-actualization.</p>\n" +
                "\n" +
                "        <p>It is important to note that self-esteem is a concept distinct from self-efficacy, which involves how well you believe you'll handle future actions, performance, or abilities.</p>\n" +
                "\n" +
                "        <p><b>Factors That Affect Self-Esteem</b><br>There are many factors that can influence self-esteem. Your self-esteem may be impacted by:</p>\n" +
                "        <ul>\n" +
                "            <li>Age</li>\n" +
                "            <li>Disability</li>\n" +
                "            <li>Genetics</li>\n" +
                "            <li>Illness</li>\n" +
                "            <li>Physical abilities</li>\n" +
                "            <li>Socioeconomic status</li>\n" +
                "            <li>Thought patterns</li>\n" +
                "        </ul>\n" +
                "        <p>Racism and discrimination have also been shown to have negative effects on self-esteem. Additionally, genetic factors that help shape a person's personality can play a role, but life experiences are thought to be the most important factor.</p>\n" +
                "\n" +
                "        <p>It is often our experiences that form the basis for overall self-esteem. For example, low self-esteem might be caused by overly critical or negative assessments from family and friends. Those who experience what Carl Rogers referred to as unconditional positive regard will be more likely to have healthy self-esteem.</p>\n" +
                "\n" +
                "        <p><b>Healthy Self-Esteem</b><br>There are some simple ways to tell if you have healthy self-esteem. You probably have healthy self-esteem if you:</p>\n" +
                "        <ul>\n" +
                "            <li>Avoid dwelling on past negative experiences</li>\n" +
                "            <li>Believe you are equal to everyone else, no better and no worse</li>\n" +
                "            <li>Express your needs</li>\n" +
                "            <li>Feel confident</li>\n" +
                "            <li>Have a positive outlook on life</li>\n" +
                "            <li>Say no when you want to</li>\n" +
                "            <li>See your overall strengths and weaknesses and accept them</li>\n" +
                "        </ul>\n" +
                "        <p>Having healthy self-esteem can help motivate you to reach your goals, because you are able to navigate life knowing that you are capable of accomplishing what you set your mind to. Additionally, when you have healthy self-esteem, you are able to set appropriate boundaries in relationships and maintain a healthy relationship with yourself and others.</p>\n" +
                "\n" +
                "        <p><b>Low Self-Esteem</b><br>Low self-esteem may manifest in a variety of ways. If you have low self-esteem:</p>\n" +
                "        <ul>\n" +
                "            <li>You may believe that others are better than you.</li>\n" +
                "            <li>You may find expressing your needs difficult.</li>\n" +
                "            <li>You may focus on your weaknesses.</li>\n" +
                "            <li>You may frequently experience fear, self-doubt, and worry.</li>\n" +
                "            <li>You may have a negative outlook on life and feel a lack of control.</li>\n" +
                "            <li>You may have an intense fear of failure.</li>\n" +
                "            <li>You may have trouble accepting positive feedback.</li>\n" +
                "            <li>You may have trouble saying no and setting boundaries.</li>\n" +
                "            <li>You may put other people's needs before your own.</li>\n" +
                "            <li>You may struggle with confidence.</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p>Low self-esteem has the potential to lead to a variety of mental health disorders, including anxiety disorders and depressive disorders. You may also find it difficult to pursue your goals and maintain healthy relationships. Having low self-esteem can seriously impact your quality of life and increases your risk for experiencing suicidal thoughts.</p>\n" +
                "\n" +
                "        <p><b>Excessive Self-Esteem</b><br>Overly high self-esteem is often mislabeled as narcissism, however there are some distinct traits that differentiate these terms. Individuals with narcissistic traits may appear to have high self-esteem, but their self-esteem may be high or low and is unstable, constantly shifting depending on the given situation. Those with excessive self-esteem:</p>\n" +
                "        <ul>\n" +
                "            <li>May be preoccupied with being perfect</li>\n" +
                "            <li>May focus on always being right</li>\n" +
                "            <li>May believe they cannot fail</li>\n" +
                "            <li>May believe they are more skilled or better than others</li>\n" +
                "            <li>May express grandiose ideas</li>\n" +
                "            <li>May grossly overestimate their skills and abilities</li>\n" +
                "        </ul>\n" +
                "        <p>When self-esteem is too high, it can result in relationship problems, difficulty with social situations, and an inability to accept criticism.</p>\n" +
                "\n" +
                "        <p><b>How to Improve Self-Esteem</b><br>Fortunately, there are steps that you can take to address problems with your perceptions of yourself and faith in your abilities. How do you build self-esteem? Some actions that you can take to help improve your self-esteem include:</p>\n" +
                "        <ul>\n" +
                "            <li>Become more aware of negative thoughts. Learn to identify the distorted thoughts that are impacting your self-worth.</li>\n" +
                "            <li>Challenge negative thinking patterns. When you find yourself engaging in negative thinking, try countering those thoughts with more realistic and/or positive ones.</li>\n" +
                "            <li>Use positive self-talk. Practice reciting positive affirmations to yourself.</li>\n" +
                "            <li>Practice self-compassion. Practice forgiving yourself for past mistakes and move forward by accepting all parts of yourself.</li>\n" +
                "        </ul>\n" +
                "        <p>Low self-esteem can contribute to or be a symptom of mental health disorders, including anxiety and depression. Consider speaking with a doctor or therapist about available treatment options, which may include psychotherapy (in-person or online), medications, or a combination of both.</p>\n" +
                "\n" +
                "        <p>Though some of the causes of low self-esteem can’t be changed, such as genetic factors, early childhood experiences, and personality traits, there are steps you can take to feel more secure and valued. Remember that no one person is less worthy than the next. Keeping this in mind may help you maintain a healthy sense of self-esteem.</p>";

        textViewAboutSelfEsteem.setText(Html.fromHtml(selfEsteemText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(SelfEsteemInfoActivity.this, MentalHealthInfoActivity.class);
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