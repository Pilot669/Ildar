package com.example.pc.ildar;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    //    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.happi);
//        setContentView(imageView);
//    }
//}





    private ImageView ing1, ing2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.OnCreate(savedInstanceState);
        ImageView(R.drawable.activity_main);
        happi();
    }

    public void happi() {

        ing1 = (ImageView) findViewById(R.id.happi1);
        text1 = (TextView) findViewById(R.id.text);
        ing2 = (ImageView) findViewById(R.id.happi2);

    }
}