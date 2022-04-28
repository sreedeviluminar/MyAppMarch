package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.sree.myappmarch.samples.GridWithImage;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
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
                Intent intent = new Intent(getApplicationContext(), GridWithImage.class);
                startActivity(intent);
                finish();

            }
        };
        obj.start();
    }
}