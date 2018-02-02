package com.smiledwatermelon.lession2m8b;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballImage;
    Button askButton;

    final int[] ballImages={R.drawable.ball1,
    R.drawable.ball2,
    R.drawable.ball3,
    R.drawable.ball4,
    R.drawable.ball5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballImage=findViewById(R.id.dicBall);
        askButton=findViewById(R.id.adviceMe);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();

                ballImage.setImageResource(ballImages[rand.nextInt(5)]);
            }
        });


    }





}
