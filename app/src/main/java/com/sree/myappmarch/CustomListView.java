package com.sree.myappmarch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.select:
                Toast.makeText(getApplicationContext(), "selected", Toast.LENGTH_LONG).show();
            case R.id.copy:
                Toast.makeText(getApplicationContext(), "Copied", Toast.LENGTH_LONG).show();
        }

      return true;
    }

}