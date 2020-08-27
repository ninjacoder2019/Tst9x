package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MakeChocolate extends AppCompatActivity {

    ImageButton choco;
    ImageView bottle, gum1, gum2, gum3, gum4, gumballtray, sugar;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_make_chocolate);

        bottle = (ImageView)findViewById(R.id.imageViewBottle);
        choco = (ImageButton) findViewById(R.id.imageViewChoco);
        gum1 = (ImageView) findViewById(R.id.imageViewGum1);
        gum2 = (ImageView) findViewById(R.id.imageViewGum2);
        gum3 = (ImageView) findViewById(R.id.imageViewGum3);
        gum4 = (ImageView) findViewById(R.id.imageViewGum4);
        gumballtray = (ImageView) findViewById(R.id.imageViewgumballtray);
        sugar = (ImageView) findViewById(R.id.imageViewSugar);

        bottle.setY(50);
        bottle.setX(20);


        if (MainActivity.whichchoco == "redball" || MainActivity.whichchoco == "yellowball" || MainActivity.whichchoco == "greenball" ||

                MainActivity.whichchoco == "purpleball" || MainActivity.whichchoco == "blueball"){

                bottle.setVisibility(View.VISIBLE);

            if(MainActivity.whichchoco == "redball"){

                bottle.setImageResource(R.drawable.redbottle);
                gum1.setImageResource(R.drawable.redball);
                gum2.setImageResource(R.drawable.redball);
                gum3.setImageResource(R.drawable.redball);
                gum4.setImageResource(R.drawable.redball);
                gumballtray.setVisibility(View.GONE);
                gum1.setVisibility(View.GONE);
                gum2.setVisibility(View.GONE);
                gum3.setVisibility(View.GONE);
                gum4.setVisibility(View.GONE);

            }
            if(MainActivity.whichchoco == "yellowball"){

                bottle.setImageResource(R.drawable.yellowbottle);
                gum1.setImageResource(R.drawable.yellowballs);
                gum2.setImageResource(R.drawable.yellowballs);
                gum3.setImageResource(R.drawable.yellowballs);
                gum4.setImageResource(R.drawable.yellowballs);
                gumballtray.setVisibility(View.GONE);
                gum1.setVisibility(View.GONE);
                gum2.setVisibility(View.GONE);
                gum3.setVisibility(View.GONE);
                gum4.setVisibility(View.GONE);

            }
            if(MainActivity.whichchoco == "greenball"){

                bottle.setImageResource(R.drawable.greenbottle);
                gum1.setImageResource(R.drawable.greenball);
                gum2.setImageResource(R.drawable.greenball);
                gum3.setImageResource(R.drawable.greenball);
                gum4.setImageResource(R.drawable.greenball);
                gumballtray.setVisibility(View.GONE);
                gum1.setVisibility(View.GONE);
                gum2.setVisibility(View.GONE);
                gum3.setVisibility(View.GONE);
                gum4.setVisibility(View.GONE);

            }
            if(MainActivity.whichchoco == "purpleball"){

                bottle.setImageResource(R.drawable.purplebottle);
                gum1.setImageResource(R.drawable.purpleball);
                gum2.setImageResource(R.drawable.purpleball);
                gum3.setImageResource(R.drawable.purpleball);
                gum4.setImageResource(R.drawable.purpleball);
                gumballtray.setVisibility(View.GONE);
                gum1.setVisibility(View.GONE);
                gum2.setVisibility(View.GONE);
                gum3.setVisibility(View.GONE);
                gum4.setVisibility(View.GONE);

            }
            if(MainActivity.whichchoco == "blueball"){

                bottle.setImageResource(R.drawable.bluebottle);
                gum1.setImageResource(R.drawable.blueball);
                gum2.setImageResource(R.drawable.blueball);
                gum3.setImageResource(R.drawable.blueball);
                gum4.setImageResource(R.drawable.blueball);
                gumballtray.setVisibility(View.GONE);
                gum1.setVisibility(View.GONE);
                gum2.setVisibility(View.GONE);
                gum3.setVisibility(View.GONE);
                gum4.setVisibility(View.GONE);

            }

        }else{

            bottle.setVisibility(View.GONE);
            gumballtray.setVisibility(View.GONE);
            gum1.setVisibility(View.GONE);
            gum2.setVisibility(View.GONE);
            gum3.setVisibility(View.GONE);
            gum4.setVisibility(View.GONE);

        }

        sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sugar.setX(250);
                sugar.setY(425);

                choco.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        final ObjectAnimator animator = ObjectAnimator.ofFloat(choco, "rotation", choco.getRotation(), choco.getRotation() + 1800);
                        animator.setDuration(2000);
                        animator.start();

                        if (animator.isStarted()) {
                            ObjectAnimator animatorX = ObjectAnimator.ofFloat(choco, "scaleX", choco.getScaleX(), choco.getScaleX() - 0.4f);
                            animatorX.setDuration(2000);
                            animatorX.start();

                            if (animatorX.isStarted()) {

                                ObjectAnimator animatorY = ObjectAnimator.ofFloat(choco, "scaleY", choco.getScaleY(), choco.getScaleY() - 0.2f);
                                animatorY.setDuration(2000);
                                animatorY.start();

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        choco.setImageResource(R.drawable.chocolateliquid);
                                        sugar.setVisibility(View.GONE);
                                        choco.setImageAlpha(1000);
                                        if (bottle.getVisibility() == View.GONE) {
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    if (MainActivity.whichchoco == "mars" || MainActivity.whichchoco == "snicker" || MainActivity.whichchoco == "twix"|| MainActivity.whichchoco == "bounty") {

                                                        Intent i = new Intent(getApplicationContext(), FreezeMars.class);
                                                        startActivity(i);

                                                    } else {
                                                        Intent i = new Intent(getApplicationContext(), FreezeChocolate.class);
                                                        startActivity(i);
                                                    }

                                                }
                                            }, 3000);
                                        } else {

                                            bottle.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {

                                                    ObjectAnimator animatorbottleY = ObjectAnimator.ofFloat(bottle, "translationY", 50, 150);
                                                    animatorbottleY.setDuration(4000);
                                                    animatorbottleY.start();

                                                    if (animatorbottleY.isStarted()) {

                                                        ObjectAnimator animatorbottleX = ObjectAnimator.ofFloat(bottle, "translationX", 20, 70);
                                                        animatorbottleX.setDuration(2500);
                                                        animatorbottleX.start();

                                                        new Handler().postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {

                                                                ObjectAnimator animatorbottlerotation = ObjectAnimator.ofFloat(bottle, "rotation", 0, 100);
                                                                animatorbottlerotation.setDuration(1500);
                                                                animatorbottlerotation.start();

                                                                new Handler().postDelayed(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        if(MainActivity.whichchoco == "blueball") {
                                                                            choco.setColorFilter(Color.BLUE);
                                                                        }
                                                                        if(MainActivity.whichchoco == "redball") {
                                                                            choco.setColorFilter(Color.RED);
                                                                        }
                                                                        if(MainActivity.whichchoco == "yellowball") {
                                                                            choco.setColorFilter(Color.YELLOW);
                                                                        }
                                                                        if(MainActivity.whichchoco == "greenball") {
                                                                            choco.setColorFilter(Color.GREEN);
                                                                        }
                                                                        if(MainActivity.whichchoco == "purpleball") {
                                                                            choco.setColorFilter(Color.rgb(128,0,128));
                                                                        }

                                                                        ObjectAnimator animatorbottlerotation = ObjectAnimator.ofFloat(bottle, "rotation", 100, 0);
                                                                        animatorbottlerotation.setDuration(1500);
                                                                        animatorbottlerotation.start();

                                                                        new Handler().postDelayed(new Runnable() {
                                                                            @Override
                                                                            public void run() {

                                                                                gumballtray.setVisibility(View.VISIBLE);

                                                                                gumballtray.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {

                                                                                        gum1.setVisibility(View.VISIBLE);
                                                                                        gum2.setVisibility(View.VISIBLE);
                                                                                        gum3.setVisibility(View.VISIBLE);
                                                                                        gum4.setVisibility(View.VISIBLE);

                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                            @Override
                                                                                            public void run() {

                                                                                                Intent i = new Intent(getApplicationContext(), EatGumBall.class);
                                                                                                startActivity(i);

                                                                                            }
                                                                                        },2000);

                                                                                    }
                                                                                });

                                                                            }
                                                                        },2500);

                                                                    }
                                                                },3500);

                                                            }
                                                        },2500);

                                                    }

                                                }
                                            });

                                        }

                                    }
                                }, 750);

                            }

                        }

                    }
                });

            }
        });

        }

    @Override
    public void onBackPressed() {

    }
}