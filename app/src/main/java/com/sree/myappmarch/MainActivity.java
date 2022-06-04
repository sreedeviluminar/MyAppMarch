package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.splashimg);

        Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequnctial);
        img.startAnimation(anim);




        // requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        Handler obj = new Handler();
//        obj.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//              Intent intent = new Intent(getApplicationContext(), LoginPage.class);
//              startActivity(intent);
//            }
//        },5000);

        Thread obj = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(getApplicationContext(), TabExample.class);
                startActivity(intent);
                finish();

            }
        };
        obj.start();
    }
}