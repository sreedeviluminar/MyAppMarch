package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("Lifecycle","OnCreate involked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","Onstart involked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","OnResume involked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","OnPause involked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","Onstop involked");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","OnRestart involked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","Ondestroy involked");

    }
}