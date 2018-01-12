package com.example.pc.ildar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView ing1, ing2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        happi();
    }
    public void happi () {

        ing1 = (ImageView)findViewById(R.id.happi1);
        text1 = (TextView)findViewById(R.id.text);
        ing2 = (ImageView)findViewById(R.id.happi2);



}

}
