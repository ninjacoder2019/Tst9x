package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class FreezeMars extends AppCompatActivity {

    ImageView freezemars, nuts, butter,coconut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_freeze_mars);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        freezemars = (ImageView)findViewById(R.id.imageViewFreezeMars);
        nuts = (ImageView)findViewById(R.id.imageViewNuts);
        butter = (ImageView)findViewById(R.id.imageViewButter);
        coconut = (ImageView)findViewById(R.id.imageViewCoconut);

        if(MainActivity.whichchoco == "bounty"){

            butter.setVisibility(View.VISIBLE);
            coconut.setVisibility(View.VISIBLE);
            nuts.setVisibility(View.GONE);

            coconut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    coconut.setX(275);
                    coconut.setY(450);

                    butter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            butter.setX(275);
                            butter.setY(450);

                            freezemars.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    coconut.setVisibility(View.GONE);
                                    butter.setVisibility(View.GONE);

                                    freezemars.setScaleX(0.7f);
                                    freezemars.setScaleY(0.6f);
                                    freezemars.setImageResource(R.drawable.chocolateliquid);

                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {

                                            Intent i = new Intent(getApplicationContext(), EatMars.class);
                                            startActivity(i);

                                        }
                                    },2000);

                                }
                            });

                        }
                    });


                }
            });

        }

        else if(MainActivity.whichchoco == "twix"){

            butter.setVisibility(View.VISIBLE);
            nuts.setVisibility(View.GONE);
            coconut.setVisibility(View.GONE);

            butter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    butter.setX(275);
                    butter.setY(450);

                    freezemars.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            butter.setVisibility(View.GONE);

                            freezemars.setScaleX(0.7f);
                            freezemars.setScaleY(0.6f);
                            freezemars.setImageResource(R.drawable.chocolateliquid);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    Intent i = new Intent(getApplicationContext(), EatMars.class);
                                    startActivity(i);

                                }
                            },2000);

                        }
                    });

                }
            });

        }
        else if(MainActivity.whichchoco == "snicker"){

            nuts.setVisibility(View.VISIBLE);
            butter.setVisibility(View.GONE);
            coconut.setVisibility(View.GONE);

            nuts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    nuts.setX(275);
                    nuts.setY(450);

                    freezemars.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            nuts.setVisibility(View.GONE);

                            freezemars.setScaleX(0.7f);
                            freezemars.setScaleY(0.6f);
                            freezemars.setImageResource(R.drawable.chocolateliquid);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    Intent i = new Intent(getApplicationContext(), EatMars.class);
                                    startActivity(i);

                                }
                            },2000);

                        }
                    });

                }
            });


        }else{

            nuts.setVisibility(View.GONE);
            butter.setVisibility(View.GONE);
            coconut.setVisibility(View.GONE);

            freezemars.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    freezemars.setScaleX(0.7f);
                    freezemars.setScaleY(0.6f);
                    freezemars.setImageResource(R.drawable.chocolateliquid);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Intent i = new Intent(getApplicationContext(), EatMars.class);
                            startActivity(i);

                        }
                    },2000);

                }
            });

        }





    }

    @Override
    public void onBackPressed() {

    }

}