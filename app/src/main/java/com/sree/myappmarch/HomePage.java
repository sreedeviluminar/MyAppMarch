package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity implements View.OnClickListener {
    RadioGroup gender;
    RadioButton r1,r2;
    CheckBox c1,c2,c3,c4;

    Spinner sp;
    ArrayAdapter arrayAdapter;
    String states[] = {"-Select State-","Kerala" ,"TamilNadu","Karnataka","J&k","Goa","Andrapradesh","Orrissa","Bihar"};

    // ArrayList districts = new ArrayList();//spinner using arraylist

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //gender =(RadioGroup) findViewById(R.id.);
        r1 =(RadioButton)findViewById(R.id.female);
        r2 =(RadioButton)findViewById(R.id.male) ;
        c1 =(CheckBox)findViewById(R.id.checkBox1);
        c2 =(CheckBox)findViewById(R.id.checkBox2);
        c3 =(CheckBox)findViewById(R.id.checkBox3);
        c4 =(CheckBox)findViewById(R.id.checkBox4);

        //    spinner using arraylist
//        districts.add("Eranakulam");
//        districts.add("Kottyam");
//        districts.add("idukki");

        sp = (Spinner)findViewById(R.id.spinner);
        arrayAdapter= new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,states);
        sp.setAdapter(arrayAdapter);

        //click on spinner
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // if we use arraylist insteaad of array add this step

                // String items =  adapterView.getItemAtPosition(i).toString(); then toast " items "

                if(adapterView.getItemAtPosition(i).equals("-Select State-")){

               } else{
                Toast.makeText(getApplicationContext(),states[i],Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                RadioButton rb = (RadioButton) findViewById(gender.getCheckedRadioButtonId());
//                String value = rb.getText().toString();
//                Toast.makeText(getApplicationContext(),"Gender is "+value,Toast.LENGTH_LONG).show();
//
//            }
//        });
      r1.setOnClickListener(this);
      r2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.female:
                String value = r1.getText().toString();
                Toast.makeText(getApplicationContext(),"Gender is "+value,Toast.LENGTH_LONG).show();

            case R.id.male:
                String value1 = r2.getText().toString();
                Toast.makeText(getApplicationContext(),"Gender is "+value1,Toast.LENGTH_LONG).show();

        }
    }
    public void show(View view) {
        boolean checkedcheckbox  =((CheckBox) view).isChecked();

        String lang ="";

        switch (view.getId()){
            case R.id.checkBox1:
                lang = checkedcheckbox ? "Malayalam Selected" :"Malayalam Deselected";
                break;
            case R.id.checkBox2:
                lang = checkedcheckbox ? "English Selected" :"English Deselected";
                break;
            case R.id.checkBox3:
                lang = checkedcheckbox ? "Hindi Selected" :"Hindi Deselected";
                break;
            case R.id.checkBox4:
                lang = checkedcheckbox ? "Tamil Selected" :"Tamil Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(),"Languages known are "+lang,Toast.LENGTH_LONG).show();
    }

    public void display(View view) {

        String langg = "Languages are ";

        if(c1.isChecked()){
            langg+=" Malayalam";
        }
        if(c2.isChecked()){
            langg+=" English";
        }
        if(c3.isChecked()){
            langg+=" Tamil";
        }
        if(c4.isChecked()){
            langg+=" Hindi";
        }

        Toast.makeText(getApplicationContext(),langg,Toast.LENGTH_LONG).show();

    }
}



