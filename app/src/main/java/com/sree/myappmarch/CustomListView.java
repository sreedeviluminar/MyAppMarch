package com.sree.myappmarch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {

    ListView flist;
    String foodnames[] = {"Apple","Banana","Bibimbap","Donut","Grapes","Hamburger",
                           "Orange","PineApple","Pizza", "Ramen","Salad"};
    int foodimages[] = {R.drawable.apple,R.drawable.bananas,R.drawable.bibimbap,R.drawable.donut,
                        R.drawable.grapes,R.drawable.hamburger,R.drawable.orange,R.drawable.pineapple,
                        R.drawable.pizza,R.drawable.ramen,R.drawable.salad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        flist = (ListView) findViewById(R.id.foodlist);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),foodimages,foodnames);
        flist.setAdapter(customAdapter);

        flist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

}