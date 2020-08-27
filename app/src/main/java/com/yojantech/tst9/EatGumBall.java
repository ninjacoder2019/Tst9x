package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class EatGumBall extends AppCompatActivity {

    ImageView gumballmachine, coin , gumball, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_eat_gum_ball);

        gumballmachine = (ImageView)findViewById(R.id.imageViewgumballmachine);
        coin = (ImageView)findViewById(R.id.imageViewCoin);
        gumball = (ImageView)findViewById(R.id.imageViewGumBall);
        home = (ImageView)findViewById(R.id.imageViewGUmHome);

        gumball.setVisibility(View.GONE);

        if(MainActivity.whichchoco == "redball"){

            gumball.setImageResource(R.drawable.redball);

        }
        if(MainActivity.whichchoco == "blueball"){

            gumball.setImageResource(R.drawable.blueball);

        }
        if(MainActivity.whichchoco == "yellowball"){

            gumball.setImageResource(R.drawable.yellowballs);

        }
        if(MainActivity.whichchoco == "purpleball"){

            gumball.setImageResource(R.drawable.purpleball);

        }
        if(MainActivity.whichchoco == "greenball"){

            gumball.setImageResource(R.drawable.greenball);

        }
        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gumball.setVisibility(View.VISIBLE);

            }
        });

        gumball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.whichchoco == "redball"){

                    gumball.setImageResource(R.drawable.buuble);

                }
                if(MainActivity.whichchoco == "blueball"){

                    gumball.setImageResource(R.drawable.bluebuuble);

                }
                if(MainActivity.whichchoco == "yellowball"){

                    gumball.setImageResource(R.drawable.yellowballs);

                }
                if(MainActivity.whichchoco == "purpleball"){

                    gumball.setImageResource(R.drawable.purplebubble);

                }
                if(MainActivity.whichchoco == "greenball"){

                    gumball.setImageResource(R.drawable.greenbuuble);

                }

                ObjectAnimator animator = ObjectAnimator.ofFloat(gumball, "scaleX", 1, 5);
                animator.setDuration(2000);
                animator.start();

                ObjectAnimator animato1r = ObjectAnimator.ofFloat(gumball, "scaleY", 1, 5);
                animato1r.setDuration(2000);
                animato1r.start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        gumball.setScaleX(1);
                        gumball.setScaleY(1);
                        if(MainActivity.whichchoco == "redball"){

                            gumball.setImageResource(R.drawable.redball);

                        }
                        if(MainActivity.whichchoco == "blueball"){

                            gumball.setImageResource(R.drawable.blueball);

                        }
                        if(MainActivity.whichchoco == "yellowball"){

                            gumball.setImageResource(R.drawable.yellowballs);

                        }
                        if(MainActivity.whichchoco == "purpleball"){

                            gumball.setImageResource(R.drawable.purpleball);

                        }
                        if(MainActivity.whichchoco == "greenball"){

                            gumball.setImageResource(R.drawable.greenball);

                        }
                        gumball.setVisibility(View.GONE);

                    }
                },2500);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });

    }

    @Override
    public void onBackPressed() {

    }
}