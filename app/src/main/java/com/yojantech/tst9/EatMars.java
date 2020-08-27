package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class EatMars extends AppCompatActivity {


    ImageView mars1, mars2, mars3, home, retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_eat_mars);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mars1 = (ImageView)findViewById(R.id.imageViewMars1);
        mars2 = (ImageView)findViewById(R.id.imageViewMars2);
        mars3 = (ImageView)findViewById(R.id.imageViewMars3);
        home = (ImageView)findViewById(R.id.imageViewHome);
        retry = (ImageView)findViewById(R.id.imageViewRetry);


        if(MainActivity.whichchoco == "bounty"){

            mars1.setImageResource(R.drawable.bounty);
            mars2.setImageResource(R.drawable.bounty);
            mars3.setImageResource(R.drawable.bounty);

        }
        else if(MainActivity.whichchoco == "twix"){

            mars1.setImageResource(R.drawable.twix);
            mars2.setImageResource(R.drawable.twix);
            mars3.setImageResource(R.drawable.twix);

        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
        mars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mars1.setVisibility(View.INVISIBLE);

            }
        });
        mars2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mars2.setVisibility(View.INVISIBLE);

            }
        });
        mars3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mars3.setVisibility(View.INVISIBLE);

            }
        });
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mars1.setVisibility(View.VISIBLE);
                mars2.setVisibility(View.VISIBLE);
                mars3.setVisibility(View.VISIBLE);

            }
        });

    }

    @Override
    public void onBackPressed() {

    }

}