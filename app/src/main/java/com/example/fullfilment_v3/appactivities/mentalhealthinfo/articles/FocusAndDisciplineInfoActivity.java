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

public class FocusAndDisciplineInfoActivity extends AppCompatActivity {

    RelativeLayout background;
    ImageView backButton;
    TextView textAboutFocusAndDiscipline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_and_discipline_info);

        background  = findViewById(R.id.layout_focus_and_discipline);
        backButton = findViewById(R.id.back_button_focus_and_discipline);
        textAboutFocusAndDiscipline = findViewById(R.id.txtAboutFocusAndDiscipline);

        String focusAndDisciplineText = "<p>If you’re looking for ways to become more successful, improve your relationships, or feel more satisfied with your life, you won’t have a hard time finding suggestions for how to go about it. Your search for such information will often lead you to tips for making healthier lifestyle choices, forming effective habits, building a better mindset, and sharpening your communication skills. Most of this advice, if you follow it, will probably lead to positive changes within yourself and your life. But how sustainable will those changes be?</p>\n" +
                "\n" +
                "        <p>The truth is, there’s one essential ingredient in the process of creating change that too often gets overlooked: discipline. Beyond the desire to do something and the motivation to get started, there is a need to put in the work—repeatedly, consistently, and enduringly.</p>\n" +
                "\n" +
                "        <p>Discipline is what kicks in long after motivation has faded. And if you’ve ever made a new year’s resolution that lasted until mid-January or set an intention on Monday that you strayed from by Friday, you know that motivation has a tendency to fade. Discipline carries you from the moment you start working on making a change, to the moment you celebrate the end result.</p>\n" +
                "\n" +
                "        <p>But here’s the kicker: Discipline is also what continues to happen well after that celebration.</p>\n" +
                "\n" +
                "        <p><b>How Change Happens</b><br>One of the most recognized theories behind behavior change, the Stages of Change Model, suggests that people move through 6 specific stages on their way to accomplishing a goal: precontemplation (not even thinking about changing), contemplation (starting to consider it), preparation (getting ready to do something different), action (putting in the work), maintenance (keeping it going), and termination (knowing there’s no going back).</p>\n" +
                "\n" +
                "        <p>Using this model as a reference point, we can say that discipline is directly involved in the last 3 stages. It takes discipline to commit to action and to do what it takes to make a change. This is the facet of discipline that requires making different choices, sometimes sacrificing the comfort of this moment for the promise of future achievement or fulfillment.</p>\n" +
                "\n" +
                "        <p>In the maintenance stage, discipline is critical. By this point in the process of change, the original motivation has probably dwindled. Your old familiar ways of thinking and behaving are threatening to override your new intentions. The efforts you made up to this point might be feeling too tiring or too tedious.</p>\n" +
                "\n" +
                "        <p>The temptation to take the path of least resistance creeps up a lot during the maintenance stage; it’s discipline that keeps you from giving in to it. And it’s discipline that takes you into the termination stage and gives you the confidence that your changes will last.</p>\n" +
                "\n" +
                "        <p><b>How You Can Become More Disciplined</b><br>For many of you reading this, the fact that discipline is essential to making lasting changes is no surprise. But the real question you might be pondering is: If I’m not good at being disciplined, how do I get better at it? While the answer is that there are many ways to go about it, let’s focus on 5 of them:</p>\n" +
                "\n" +
                "        <p><b>Identify the areas where you struggle most.</b> For some people it’s following through on a task or commitment; for others, it’s finishing what they’ve started. Some people have the hardest time with implementing new behaviors on a consistent basis. Others struggle most with making excuses and talking themselves out of their efforts to change. Take an honest look at your own challenge areas, so you can see where the work is most needed.</p>\n" +
                "\n" +
                "        <p><b>Set yourself up for success.</b> Sometimes, the things that get in the way of being disciplined are things people tend not to consider, like getting enough sleep and maintaining proper nutrition. Paying attention to these lifestyle basics will help you access the energy and mental focus you’ll need to stay disciplined.</p>\n" +
                "\n" +
                "        <p><b>Notice the thoughts and emotions that drain you of discipline.</b> It’s one thing to work towards a goal when you’re motivated; it’s another to keep at it, even when you don’t feel like it. This is what discipline is all about. Your thoughts and feelings, which are constantly changing, can easily keep you from making good on the promises you make to yourself. To keep this from happening, pay attention to the emotions and feeling states that tend to derail you, and be mindful of the kinds of thoughts that keep you from sticking to your commitments.</p>\n" +
                "\n" +
                "        <p><b>Write things down and set reminders.</b> Distraction is a big barrier to discipline. To keep it from taking you off course, organize yourself by writing down your goals/intentions/tasks and keeping them somewhere you’ll be sure to look at on a regular basis. Get a calendar or planner, if you don’t already have one, where you can write things down and keep yourself organized. Set reminders in your phone or use organizational apps and digital tools to keep yourself on track.</p>\n" +
                "\n" +
                "        <p><b>Practice delayed gratification.</b> Our world is wiring us all for instant gratification, and it’s never been easier to take shortcuts and stay on the comfortable path of least resistance. But discipline requires delayed gratification—the ability to sustain effort in the absence of reward. This can be incredibly difficult, especially if you didn’t develop the ability early on in life, but you can train yourself to get better at it. Start with small practices, like not turning on the TV until you’ve completed all the essential tasks on your to-do list; not opening TikTok until you’ve sent those important work emails; or waiting to enjoy your morning coffee until after you’ve finished a 30-minute workout. Eventually, you can build up to setting bigger goals that require discipline and delayed gratification to complete.</p>\n" +
                "\n" +
                "        <p>If you aren’t a naturally disciplined person, there’s no reason to panic. Work on developing more of it, and you’ll be well on your way to making—and solidifying—the kinds of changes you want to see in yourself, your relationships, and your life.</p>\n" +
                "\n" +
                "        <p>Psychologist Mihaly Csikszentmihalyi wrote that “few things are sadder than encountering a person who knows exactly what he should do, yet cannot muster enough energy to do it.” Why don’t we do what we know needs to get done? Why is it so hard to concentrate and finish what we start? In our digital age, is there any hope of “mustering enough energy” to stay focused on what really matters so we can live the lives we want? In this part one of a two-part series, we will examine why we get distracted.</p>\n" +
                "\n" +
                "        <p><b>I can’t focus. Why?</b><br>Csikszentmihalyi argues that intense focus is possible only when a person has clear goals and the capacity to complete the tasks necessary to achieve them. Focus not only requires the ability to do the tasks at hand, but also the ability to deal with distractions that may take you off track. The trouble is, even though you may have the capacity to complete a task, you may not be able to avoid distraction and focus.</p>\n" +
                "\n" +
                "        <p>While endless smart phone checking is a symptom of the problem, it is not the root cause of why you find it hard to focus. You ultimately can’t blame your phone for that promotion you didn’t get or the fact you stayed in bed scrolling Instagram instead of going to the gym. To learn how to focus, you must adopt new skills as well as understand the most common causes of distraction. There are several reasons why it’s hard to focus:</p>\n" +
                "\n" +
                "        <p><b>You’re Stuck in an Unhealthy Rut</b><br>In a University College London study, participants were asked to sit at a computer and direct a cloud of dots. They were instructed to move a lever to the right if a dot cloud was moving right and to the left if a dot cloud was moving left. Participants did this with accuracy. That is, until researchers added a weight to one side of the lever making it harder to move one way. The result? Participants began moving the lever in the wrong, yet easier, direction.</p>\n" +
                "\n" +
                "        <p>As the task became more difficult, participants subconsciously changed how they played the game. This study supports research from evolutionary biologists who argue humans have evolved to avoid energy consuming tasks by taking the path of least resistance.</p>\n" +
                "\n" +
                "        <p>Doing what we know we should do is often hard. If we fall into a routine of avoiding discomfort by taking too many breaks, we learn it’s easier to break our focus than do what we know we should. As the dot study shows, we quickly learn how to avoid discomfort by changing the game.</p>\n" +
                "\n" +
                "        <p>Henry Ford said, “Thinking is the hardest work there is, which is probably the reason so few engage in it.” If checking email for a quick minute takes the pressure off having to think through a big assignment at work, you’ll keep clicking away if you don’t have the tools to realize and deal with the difficulty. If you don’t change your ways, you’ll soon carve a mental rut that teaches your brain to automatically escape hard work instead of working through it.</p>\n" +
                "\n" +
                "        <p><b>You Don’t Know How to Focus on Things You Dislike</b><br>If you like doing something, you are more likely to do it. If you enjoy shopping for instance, you’ll seek out opportunities for “retail therapy.” However, if you find shopping to be a burden, you will avoid it unless absolutely necessary.</p>\n" +
                "\n" +
                "        <p>Unfortunately, many things you need to do in life aren’t particularly enjoyable. Few people enjoy doing their taxes, but they need to get it done nonetheless. When you don’t enjoy a task, you’re more likely to seek an escape and lose focus.</p>\n" +
                "\n" +
                "        <p>How then, do you stay focused doing something you dislike? Ian Bogost, a professor at Georgia Tech and a professional video game designer, argues that we have the power to reimagine tasks to make them more enjoyable. In his book, <i>Play Anything</i>, Bogost challenges readers to tackle everyday tasks with the same discipline and focus used to play a game.</p>\n" +
                "\n" +
                "        <p>Bogost states that we should focus more intensely on the task at hand rather than concentrating on the end result or reward. Bogost highlights this theory using his attempt to make lawn mowing more enjoyable. To learn to enjoy the job of cutting his grass, Bogost focused more intensely on it. He learned everything he could about the practice and challenge himself to find the variability in the activity.</p>\n" +
                "\n" +
                "        <p>For instance, he sought to find the optimal path for cutting the grass or beating his previous time. By reimagining a task, you can make anything more enjoyable and intrinsically rewarding.</p>\n" +
                "\n" +
                "        <p><b>You’re Telling Yourself You “Don’t Have Time”</b><br>In a Monthly Labor Review study, participants who reported working between 65-74 hours a week overestimated their workweek by approximately 20 hours.</p>\n" +
                "\n" +
                "        <p>Too often, people confuse being productive with being busy. However, there is evidence to suggest that “being too busy” to work on your goals indicates a lack of focus, not a lack of time.</p>\n" +
                "\n" +
                "        <p>Every day, we choose how to spend our time. Wake up early, or hit the snooze? Take that part-time course or leave it for next month? Put clothes away now, or let them pile up? If everyone has the same 24-hours in their day, why are some people able to accomplish so much more?</p>\n" +
                "\n" +
                "        <p>Research shows that the secret to time-management might not such a secret after all. Laura Vanderkam, time management and productivity author, has found that the most productive people are not time management wizards, rather, they are highly skilled at setting priorities. Highly productive people have a limited, focused list of what they want to accomplish and allocate time accordingly. She argues that the “I don’t have time excuse” is a passive way of admitting something “is not one of my priorities.”</p>\n" +
                "\n" +
                "        <p>In a 2018 study on the top productivity technique, researchers found that the number one secret to time management was deciding what you want to do and when you want to do it. This method of time management is frequently referred to as “timeboxing.” By designated parts of your day for certain tasks, you become more likely to use your time the way you intended.</p>\n" +
                "\n" +
                "        <p>You replace time that you’re likely to get distracted by with meaningful activities that propel you towards your goals. Effective timeboxing starts with allocating time on your schedule for what matters most.</p>";

        textAboutFocusAndDiscipline.setText(Html.fromHtml(focusAndDisciplineText, Html.FROM_HTML_MODE_COMPACT));

        backButton.setOnClickListener(view -> {
            finish();
            Intent backIntent = new Intent(FocusAndDisciplineInfoActivity.this, MentalHealthInfoActivity.class);
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