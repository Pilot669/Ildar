package com.example.pc.ildar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class SecondActivity extends AppCompatActivity {

    private ImageView ing1, inr2;
    private MediaPlayer ing1Sound, ing2Sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ing1 = (ImageView)findViewById(R.id.happi1);
        inr2 = (ImageView)findViewById(R.id.happi2);

        ing1Sound = MediaPlayer.create(this, R.raw.bystraya);
        ing2Sound = MediaPlayer.create(this, R.raw.happi2);

        imageClick ();
    }

    public void imageClick () {
       ing1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay (ing1Sound);
                    }
                }
        );

       inr2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay (ing2Sound);
                    }
                }
        );
    }

    public void soundPlay (MediaPlayer sound) { sound.start(); }

}

