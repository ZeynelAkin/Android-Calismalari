package com.example.sonsanszar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {
    ImageView imgSplash;
    private static int gecis_suresi=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imgSplash=(ImageView)findViewById(R.id.splashId);
        imgSplash.setImageResource(R.drawable.zar_2712);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imgSplash.startAnimation((animation));


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis=new Intent(splashScreen.this,MainActivity.class);
                startActivity(gecis);
                finish();
            }
        },gecis_suresi);
    }
}
