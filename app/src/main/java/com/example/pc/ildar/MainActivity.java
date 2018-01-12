package com.example.pc.ildar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button  act_change;
    private MediaPlayer changeSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        imageClic();

        changeSound = MediaPlayer.create(this, R.raw.bystraya);
    }

    public void imageClic () {
        act_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay(changeSound);

                    }
                }
        );
    }
    public void soundPlay (MediaPlayer sound){
        sound.start();
    }

    public void addListenerOnButton () {
        act_change = (Button) findViewById(R.id.change);
        act_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.pc.ildar.SecondActivity");
                        startActivity(intent);
                    }
                }
        );

    }
}
