package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerViewDemo extends AppCompatActivity {

    ArrayList<String> foodnames = new ArrayList<String>(Arrays.asList("Apple","Banana","Bibimbap","Donut","Grapes","Hamburger",
            "Orange","PineApple","Pizza", "Ramen","Salad"));

    ArrayList<Integer> foodimages = new ArrayList<Integer>(Arrays.asList(R.drawable.apple,R.drawable.bananas,R.drawable.bibimbap,R.drawable.donut,
            R.drawable.grapes,R.drawable.hamburger,R.drawable.orange,R.drawable.pineapple,
            R.drawable.pizza,R.drawable.ramen,R.drawable.salad));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        CustomAdapterRecycler customAdapterRecycler = new CustomAdapterRecycler(getApplicationContext(),foodimages,foodnames);
        recyclerView.setAdapter(customAdapterRecycler);
    }
}