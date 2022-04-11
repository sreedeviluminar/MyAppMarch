package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login = (Button) findViewById(R.id.login);

//    1. ******  USING ANONYMOUS INNER CLASS *******

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),HomePage.class);
//                startActivity(i);
//            }
//        });

//  2. ***** USING XML ****

//    public void login(View view) {
//
//        Toast.makeText(getApplicationContext(),"Login Success", Toast.LENGTH_LONG).show();
//    }

//  3 . ********* IMPLEMENT LISTENER ******

        login.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(),HomePage.class);
        startActivity(i);
    }
}