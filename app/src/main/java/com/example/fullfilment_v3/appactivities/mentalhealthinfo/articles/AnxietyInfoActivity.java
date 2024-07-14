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

public class AnxietyInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutAnxiety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_info);

        background = findViewById(R.id.layout_Anxiety);
        backButton = findViewById(R.id.back_button_Anxiety);
        textAboutAnxiety = findViewById(R.id.txtAboutAnxiety);

        String AnxietyText = "<p>Anxiety, the experience of worry or fear, is a natural biological response that arises in response to uncertain and potentially threatening situations. For some, however, anxiety can occur in many situations not just threatening ones and may lead to avoidance behaviours, social withdrawal and possibly panic attacks.</p>\n" +
                "        \n" +
                "        <p>Anxiety in school students is fairly common and if left unmanaged, mild anxiety can become stronger over time and seriously impact a person’s quality of life and wellbeing.</p>\n" +
                "        \n" +
                "        <p><b>Signs this might be a problem:</b></p>\n" +
                "        <ul>\n" +
                "            <li>constantly feeling worried</li>\n" +
                "            <li>unable to concentrate</li>\n" +
                "            <li>often feeling nervous or on edge</li>\n" +
                "            <li>difficulty concentrating</li>\n" +
                "            <li>feeling as though your heart is racing or pounding or excessive blushing</li>\n" +
                "            <li>dry mouth</li>\n" +
                "            <li>feeling as though you are having difficulty breathing (often during a panic attack)</li>\n" +
                "        </ul>\n" +
                "        \n" +
                "        <p><b>What is anxiety?</b><br>Anxiety is a natural biological response to fear or uncertain situations. It involves feeling worried or fearful and often triggers the avoidance of a particular situation. Sometimes anxiety can become generalised, with people experiencing anxiety in many situations, not just uncertain or dangerous ones. In such circumstances, anxiety can become detrimental to wellbeing as it may lead to people avoiding all kinds of situations or social engagements perceived to be too stressful.</p>\n" +
                "        \n" +
                "        <p>If anxiety begins to interfere with daily functioning it may be classified as an anxiety disorder. Often anxiety disorders will develop during adolescence and can co-occur with depression, with students presenting signs of anxiety and depression at school.</p>\n" +
                "        \n" +
                "        <p><b>Emotional signs of anxiety include:</b></p>\n" +
                "        <ul>\n" +
                "            <li>persistent and unfounded fear or worry (either about past or future events)</li>\n" +
                "            <li>difficulty concentrating, having mind blanks or impaired memory</li>\n" +
                "            <li>feeling indecisive, confused, irritable or impatient</li>\n" +
                "            <li>feeling constantly on edge or nervous</li>\n" +
                "            <li>interrupted sleeping patterns, possibly with vivid dreams</li>\n" +
                "        </ul>\n" +
                "        \n" +
                "        <p><b>Physical symptoms include:</b></p>\n" +
                "        <ul>\n" +
                "            <li>rapid heart-beat, feeling as though your heart is pounding or chest pain</li>\n" +
                "            <li>excessive or uncomfortable blushing</li>\n" +
                "            <li>uneven breathing or shortness of breath</li>\n" +
                "            <li>dizziness, headache, nausea</li>\n" +
                "            <li>sweating, tingling and numbness</li>\n" +
                "            <li>dry mouth, sweaty palms</li>\n" +
                "            <li>muscle aches and possible tremors/shaking</li>\n" +
                "        </ul>\n" +
                "        \n" +
                "        <p><b>Common anxiety disorders</b><br>There are many different kinds of anxiety disorders depending on the focus and nature of the anxiety. Some of the most common anxiety disorders experienced by young people are:</p>\n" +
                "        \n" +
                "        <p><b>Generalised Anxiety Disorder</b><br>Generalised anxiety disorder, or GAD, refers to when individuals experience anxiety across a range of situations and the worry is excessive and hard for the person to control. Those experiencing GAD will usually also have physical symptoms of anxiety and these symptoms need to be present for the majority of the time over a six month period for GAD to be diagnosed.</p>\n" +
                "        \n" +
                "        <p><b>Social Anxiety or Phobia</b><br>Social anxiety or phobia occurs when a person becomes fearful of social situations, worrying excessively about the prospect of being embarrassed or humiliated in front of others. People with social phobia experience intense anxiety over the prospect of being judged negatively by others. This may present as a fear of speaking and eating in front of others, or of engaging in any social events. People with social anxiety often avoid social situations.</p>\n" +
                "        \n" +
                "        <p><b>Panic Disorders</b><br>Panic attacks are sudden and often unpredictable episodes of intense anxiety, with acute physiological responses (often being mistaken for or likened to the sensation of having a heart attack). Panic attacks are only classified as such when it is considered to be a disproportionate response to a situation. A panic disorder may be present when an individual has a panic attack and then persistently worries about experiencing more panic attacks for at least one month, and this has a significant impact on their wellbeing. Some people with panic disorders may begin to withdraw and avoid situations they fear a panic attack may occur, however, given panic attacks are often unpredictable, and occur sporadically this can lead to a general avoidance of many situations.</p>\n" +
                "        \n" +
                "        <p><b>Agoraphobia</b><br>Some people with Panic Disorder also experience Agoraphobia. Agoraphobia occurs when a person withdraws from situations where they fear a panic attack may occur. People with agoraphobia may feel extreme anxiety about not being about to leave a place where they anticipate a panic attack may occur (for example, public transport). This can become so extreme that a person may withdraw entirely (not leaving their homes). People who experience panic attacks at a young age are more at risk of developing agoraphobia.</p>\n" +
                "        \n" +
                "        <p><b>Specific phobias</b><br>Specific phobias arise when a person experiences intense fear and worry about a specific object or situation. To be considered a phobia the anxiety experienced must be considered to be an unreasonable response (e.g. no actual threat or very little likelihood of threat actually occurring presently in the object or situation).</p>\n" +
                "        \n" +
                "        <p><b>Common disorders associated with anxiety</b></p>\n" +
                "        \n" +
                "        <p><b>Obsessive-Compulsive Disorder (OCD)</b><br>Obsessive-compulsive disorder or OCD is an anxiety disorder that, although relatively uncommon in the general population, tends to develop during childhood or adolescence when it occurs. OCD is characterised by obsessive thoughts, behaviours and/or impulses. These frequently occurring, intrusive and unwanted thoughts trigger anxiety, and often a person will respond with compulsive and repetitive behaviours that temporarily reduce anxiety.</p>\n" +
                "        \n" +
                "        <p>OCD can often stem from fears about health, contamination and safety, a need for order (symmetry and exactness), sexual impulses or religious obsession. Repetitive behaviours may include things like compulsive hand-washing, repetition of ordering/counting or touch. If left untreated OCD may become a lifelong illness.</p>\n" +
                "        \n" +
                "        <p><b>Post-Traumatic Stress Disorder (PTSD)</b><br>Post-traumatic stress disorder is a disorder that occurs after a person experiences a traumatic incident, such as witnessing or experiencing violence, sexual assault or being involved in an accident. After experiencing such an event it is natural for a person to experience anxiety and distress. For most people, these symptoms will reduce naturally over time. If this does not resolve or begin to diminish after several weeks and is causing significant distress to the person, they may be suffering PTSD.</p>\n" +
                "        \n" +
                "        <p>Symptoms of PTSD are quite distinct, involving some form of re-experiencing the initial trauma. This may occur through upsetting and intrusive memories, vivid flashbacks or recurrent dreams of the event. In response to PTSD and to reduce anxiety people may avoid situations or people that remind them of the event (e.g. if attacked at night, a person may not leave their house after dark alone or if involved in a car accident, a person may avoid being in a car). Other symptoms may include a general sense of unease or constantly feeling on edge and insomnia.</p>";

        textAboutAnxiety.setText(Html.fromHtml(AnxietyText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(AnxietyInfoActivity.this, MentalHealthInfoActivity.class);
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