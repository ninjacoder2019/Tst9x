package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class FreezeChocolate extends AppCompatActivity {

    ImageView chocolatetray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_freeze_chocolate);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        chocolatetray = (ImageView)findViewById(R.id.imageButtonChocolateTray);

        chocolatetray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        chocolatetray.setRotation(0);
        chocolatetray.setScaleX(0.5f);
        chocolatetray.setScaleY(1.4f);
        chocolatetray.setImageResource(R.drawable.chocolateliquid);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

             Intent i = new Intent(getApplicationContext(), EatChocolate.class);
             startActivity(i);

            }
        }, 2000);



            }
        });

    }
}