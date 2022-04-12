package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {

    //variable declaration

    Button login;
    EditText un,pw;
    TextView labeltext;
    String username = "admin";
    String password = "abc123";
    int clickcount = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

 //       Ui and java connected
         login     = (Button) findViewById(R.id.login);
         un        = (EditText)findViewById(R.id.username);
         pw        = (EditText)findViewById(R.id.password);
         labeltext =(TextView)findViewById(R.id.labeltext);
//  3 . ********* IMPLEMENT LISTENER ******
        login.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        String uname = un.getText().toString();
        String pword = pw.getText().toString();

        if(username.equals(uname) && password.equals(pword)) {

            Intent i = new Intent(getApplicationContext(), HomePage.class);
            //passing username to Homepage through intent
            i.putExtra("user",uname);
            startActivity(i);

        }else{

            Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_LONG).show();
            clickcount--;

            if(clickcount == 0){

                login.setEnabled(false); //disabling the Button
                labeltext.setText("LOGIN BLOCKED");
                labeltext.setTextColor(Color.RED);
            }

        }
    }
}




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
