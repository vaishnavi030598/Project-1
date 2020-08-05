package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    MediaPlayer mediaPlayer;
    public void playaudio(View view)
    {
        Button buttonpressed=(Button) view;
        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(buttonpressed.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.button1:
                mediaPlayer=MediaPlayer.create(this,R.raw.goodevening);
                mediaPlayer.start();
                break;
            case R.id.button2:
                mediaPlayer=MediaPlayer.create(this,R.raw.iloveyou);
                mediaPlayer.start();
                break;
            case R.id.button3:
                mediaPlayer=MediaPlayer.create(this,R.raw.idontspeakspanish);
                mediaPlayer.start();
                break;
            case R.id.button4:
                mediaPlayer=MediaPlayer.create(this,R.raw.imsorry);
                mediaPlayer.start();
                break;
            case R.id.button5:
                mediaPlayer=MediaPlayer.create(this,R.raw.howareu);
                mediaPlayer.start();
                break;
            case R.id.button6:
                mediaPlayer=MediaPlayer.create(this,R.raw.hello);
                mediaPlayer.start();
                break;
            case R.id.button7:
                mediaPlayer=MediaPlayer.create(this,R.raw.thankyou);
                mediaPlayer.start();
                break;
            case R.id.button8:
                mediaPlayer=MediaPlayer.create(this,R.raw.welcome);
                mediaPlayer.start();
                break;
        }

    }*/
    }
}