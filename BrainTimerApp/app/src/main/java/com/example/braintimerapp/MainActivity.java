package com.example.braintimerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button goButton,option0,option1,option2,option3;
    Button playAgain;
    TextView timerTextView,counterTextView,textView,resultTextView;
    GridLayout gridLayout;
    CountDownTimer time;
    int correct;
    int rand1,rand2;
    int score=0;
    int numberOfQuestions=0;
    ArrayList<Integer> answers=new ArrayList<Integer>();

    public void start(View view)
    {
        goButton.setVisibility(view.INVISIBLE);
        timerTextView.setVisibility(view.VISIBLE);
        counterTextView.setVisibility(view.VISIBLE);
        textView.setVisibility(view.VISIBLE);
        gridLayout.setVisibility(view.VISIBLE);
        //resultTextView.setVisibility(View.INVISIBLE);
        optionsAre();
      time = new CountDownTimer(30000,1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
                timerTextView.setText(String.valueOf(millisUntilFinished/1000)+"s");
            }

            @Override
            public void onFinish() {
                //restart the timer
                //make count reset to 0/0
                cancel();
                playAgain.setVisibility(View.VISIBLE);
            }
        }.start();

    }
    public void optionsAre()
    {
        Random rand=new Random();
        rand1=rand.nextInt(31);
        rand2=rand.nextInt(31);
        textView.setText(Integer.toString(rand1)+" "+"+"+" "+Integer.toString(rand2));

        correct=rand.nextInt(4);
        answers.clear();

        for(int i=0;i<4;i++)
        {
            if(i==correct)
            {
                answers.add(rand1+rand2);
            }
            else
            {
                int wrongAnswer=rand.nextInt(61);
                while(wrongAnswer==(rand1+rand2))
                {
                    wrongAnswer=rand.nextInt(61);
                }
                answers.add(wrongAnswer);
            }
        }
        option0.setText(Integer.toString(answers.get(0)));
        option1.setText(Integer.toString(answers.get(1)));
        option2.setText(Integer.toString(answers.get(2)));
        option3.setText(Integer.toString(answers.get(3)));


    }

    public void playagain(View view)
    {
        time.start();
        optionsAre();
        score=0;
        numberOfQuestions=0;
        counterTextView.setText(Integer.toString(score)+"/"+Integer.toString(numberOfQuestions));
    }

    public void ChooseAnswer(View view)
    {
        resultTextView.setVisibility(View.VISIBLE);
        Button buttonpressed=(Button) view;
        if(Integer.toString(correct).equals(buttonpressed.getTag().toString()))
        {
            resultTextView.setText("Correct!");
            score++;
        }
        else
        {
            resultTextView.setText("Wrong!");
        }
        numberOfQuestions++;
        counterTextView.setText(Integer.toString(score)+"/"+Integer.toString(numberOfQuestions));
        optionsAre();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goButton=findViewById(R.id.goButton);

        timerTextView=findViewById(R.id.timerTextView);
        counterTextView=findViewById(R.id.counterTextView);
        textView=findViewById(R.id.textView);
        resultTextView=findViewById(R.id.resultTextView);
        playAgain=findViewById(R.id.playAgainbutton);

        gridLayout=findViewById(R.id.gridLayout);

        option0=findViewById(R.id.option0);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);

    }
}