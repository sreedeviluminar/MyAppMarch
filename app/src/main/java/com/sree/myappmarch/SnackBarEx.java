package com.sree.myappmarch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarEx extends AppCompatActivity {

    CoordinatorLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        layout=(CoordinatorLayout) findViewById(R.id.layout);
    }

    public void opensnack(View view) {
        Snackbar obj = Snackbar.make(layout,"Snackbar Opened",Snackbar.LENGTH_LONG)
                .setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Ok Fine",Toast.LENGTH_SHORT).show();
                    }
                });
        obj.show();
    }
}