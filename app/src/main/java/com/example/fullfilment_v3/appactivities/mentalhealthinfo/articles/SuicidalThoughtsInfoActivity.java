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

public class SuicidalThoughtsInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    TextView textViewAboutSuicidalThoughts;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suicidal_thoughts_info);

        background = findViewById(R.id.layout_suicidal_thoughts);
        textViewAboutSuicidalThoughts = findViewById(R.id.txtAboutSuicidalThoughts);
        backButton = findViewById(R.id.back_button_suicidal_thoughts);

        String suicidalThoughtsText = "<p>If you’re thinking about suicide, your pain may seem overwhelming and permanent. But there are ways to cope with suicidal thoughts and feelings and overcome the pain.</p>\n" +
                "\n" +
                "        <p>No matter how much pain you’re experiencing right now, you’re not alone. Many of us have had suicidal thoughts at some point in our lives. Feeling suicidal is not a character defect, and it doesn’t mean that you are crazy, or weak, or flawed. It only means that you have more pain than you can cope with right now. But with time and support, you can overcome your problems and the pain and suicidal feelings will pass.</p>\n" +
                "\n" +
                "        <p>Some of the finest, most admired, needed, and talented people have been where you are now. Many of us have thought about taking our own lives when we’ve felt overwhelmed by depression and devoid of all hope. But the pain of depression can be treated and hope can be renewed.</p>\n" +
                "\n" +
                "        <p>No matter what your situation, there are people who need you, places where you can make a difference, and experiences that can remind you that life is worth living. It takes real courage to face death and step back from the brink. You can use that courage to face life, to learn coping skills for overcoming depression, and for finding the strength to keep going. Remember:</p>\n" +
                "        <ul>\n" +
                "            <li>Your emotions are not fixed—they are constantly changing. How you feel today may not be the same as how you felt yesterday or how you’ll feel tomorrow or next week.</li>\n" +
                "            <li>Your absence would create grief and anguish in the lives of friends and loved ones.</li>\n" +
                "            <li>There are many things you can still accomplish in your life.</li>\n" +
                "            <li>There are sights, sounds, and experiences in life that have the ability to delight and lift you—and that you would miss.</li>\n" +
                "            <li>Your ability to experience pleasurable emotions is equal to your ability to experience distressing emotions.</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><b>Why do I feel suicidal?</b><br>Many kinds of emotional pain can lead to thoughts of suicide. The reasons for this pain are unique to each one of us, and the ability to cope with the pain differs from person to person. We are all different. There are, however, some common causes that may lead us to experience suicidal thoughts and feelings.</p>\n" +
                "\n" +
                "        <p><b>Why suicide can seem like the only option</b><br>If you are unable to think of solutions other than suicide, it is not that other solutions don’t exist, but rather that you are currently unable to see them. The intense emotional pain that you’re experiencing right now can distort your thinking so it becomes harder to see possible solutions to problems—or to connect with those who can offer support.</p>\n" +
                "\n" +
                "        <p>Therapists, counselors, friends, or loved ones can help you to see solutions that otherwise may not be apparent to you. Please give them a chance to help.</p>\n" +
                "\n" +
                "        <p><b>A suicidal crisis is almost always temporary</b><br>Although it might seem as if your pain and unhappiness will never end, it is important to realize that crises are usually temporary. Solutions are often found, feelings change, unexpected positive events occur. Remember: suicide is a permanent solution to a temporary problem. Give yourself the time necessary for things to change and the pain to subside.</p>\n" +
                "\n" +
                "        <p><b>Even problems that seem hopeless have solutions</b><br>Mental health conditions such as depression, schizophrenia, and bipolar disorder are all treatable with changes in lifestyle, therapy, and medication. Most people who seek help can improve their situation and recover.</p>\n" +
                "\n" +
                "        <p>Even if you have received treatment for a disorder before, or if you’ve already made attempts to solve your problems, know that it’s often necessary to try different approaches before finding the right solution or combination of solutions. When medication is prescribed, for example, finding the right dosage often requires an ongoing process of adjustment. Don’t give up before you’ve found the solution that works for you. Virtually all problems can be treated or resolved.</p>\n" +
                "\n" +
                "        <p><b>Take these immediate actions</b><br>If you’re feeling suicidal at this moment, please follow these five steps:</p>\n" +
                "        <ul>\n" +
                "            <li><b>Step #1: Promise not to do anything right now</b><br>Even though you’re in a lot of pain right now, give yourself some distance between thoughts and action. Make a promise to yourself: “I will wait 24 hours and won’t do anything drastic during that time.” Or, wait a week.</li>\n" +
                "            <li>Thoughts and actions are two different things—your suicidal thoughts do not have to become a reality. There is no deadline, no one’s pushing you to act on these thoughts immediately. Wait. Wait and put some distance between your suicidal thoughts and suicidal action.</li>\n" +
                "\n" +
                "            <li><b>Step #2: Avoid drugs and alcohol</b><br>Suicidal thoughts can become even stronger if you have taken drugs or alcohol. It is important to not use nonprescription drugs or alcohol when you feel hopeless or are thinking about suicide.</li>\n" +
                "\n" +
                "            <li><b>Step #3: Make your home safe</b><br>Remove things you could use to hurt yourself, such as pills, knives, razors, or firearms. If you are unable to do so, go to a place where you can feel safe. If you are thinking of taking an overdose, give your medicines to someone who can return them to you one day at a time as you need them.</li>\n" +
                "\n" +
                "            <li><b>Step #4: Don’t keep these suicidal feelings to yourself</b><br>Many of us have found that the first step to coping with suicidal thoughts and feelings is to share them with someone we trust. It may be a family member, friend, therapist, member of the clergy, teacher, family doctor, coach, or an experienced counselor at the end of a helpline.</li>\n" +
                "            <li>Find someone you trust and let them know how bad things are. Don’t let fear, shame, or embarrassment prevent you from seeking help. And if the first person you reach out to doesn’t seem to understand, try someone else. Just talking about how you got to this point in your life can release a lot of the pressure that’s building up and help you find a way to cope.</li>\n" +
                "\n" +
                "            <li><b>Step #5: Take hope – people DO get through this</b><br>Even people who feel as badly as you are feeling now manage to survive these feelings. Take hope in this. There is a very good chance that you are going to live through these feelings, no matter how much self-loathing, hopelessness, or isolation you are currently experiencing. Just give yourself the time needed and don’t try to go it alone.</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><b>Reaching out for help</b><br>Even if it doesn’t feel like it right now, there are many people who want to support you during this difficult time. Reach out to someone. Do it now. If you promised yourself 24 hours or a week in step #1 above, use that time to tell someone what’s going on with you. Talk to someone who won’t try to argue about how you feel, judge you, or tell you to just “snap out of it.” Find someone who will simply listen and be there for you.</p>\n" +
                "\n" +
                "        <p>It doesn’t matter who it is, as long as it’s someone you trust and who is likely to listen with compassion and acceptance.</p>\n" +
                "\n" +
                "        <p><b>How to talk to someone about your suicidal thoughts</b><br>Even when you’ve decided who you can trust to talk to, admitting your suicidal thoughts to another person can be difficult.</p>\n" +
                "        <ul>\n" +
                "            <li>Tell the person exactly what you are telling yourself. If you have a suicide plan, explain it to them.</li>\n" +
                "            <li>Phrases such as, ‘I can’t take it anymore’ or ‘I’m done’ are vague and do not illustrate how serious things really are. Tell the person you trust that you are thinking about suicide.</li>\n" +
                "            <li>If it is too difficult for you to talk about, try writing it down and handing a note to the person you trust. Or send them an email or text and sit with them while they read it.</li>\n" +
                "        </ul>\n" +
                "\n" +
                "        <p><b>What if you don’t feel understood?</b><br>If the first person you reached out to doesn’t seem to understand, tell someone else or call a suicide crisis helpline. Don’t let a bad experience stop you from finding someone who can help.</p>";

        textViewAboutSuicidalThoughts.setText(Html.fromHtml(suicidalThoughtsText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(SuicidalThoughtsInfoActivity.this, MentalHealthInfoActivity.class);
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