package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class EatChocolate extends AppCompatActivity {

    ImageView p0,p1, p2,p3,p4,p5,p6,p7,p8,p9,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,
            p35,p36,p37,p38, retry, home;
    LinearLayout horiz1, horiz2, horiz3, horiz4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_eat_chocolate);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        p0 = (ImageView)findViewById(R.id.imageViewpiece);
        p1 = (ImageView)findViewById(R.id.imageViewpiece1);
        p2 = (ImageView)findViewById(R.id.imageViewpiece2);
        p3 = (ImageView)findViewById(R.id.imageViewpiece3);
        p4 = (ImageView)findViewById(R.id.imageViewpiece4);
        p5 = (ImageView)findViewById(R.id.imageViewpiece5);
        p6 = (ImageView)findViewById(R.id.imageViewpiece6);
        p7 = (ImageView)findViewById(R.id.imageViewpiece7);
        p8 = (ImageView)findViewById(R.id.imageViewpiece8);
        p9 = (ImageView)findViewById(R.id.imageViewpiece9);
        p19 = (ImageView)findViewById(R.id.imageView26);
        p20 = (ImageView)findViewById(R.id.imageView27);
        p21 = (ImageView)findViewById(R.id.imageView28);
        p22 = (ImageView)findViewById(R.id.imageView29);
        p23 = (ImageView)findViewById(R.id.imageView30);
        p24 = (ImageView)findViewById(R.id.imageView31);
        p25 = (ImageView)findViewById(R.id.imageView32);
        p26 = (ImageView)findViewById(R.id.imageView33);
        p27 = (ImageView)findViewById(R.id.imageView34);
        p28 = (ImageView)findViewById(R.id.imageView35);
        p29 = (ImageView)findViewById(R.id.imageView36);
        p30 = (ImageView)findViewById(R.id.imageView37);
        p31 = (ImageView)findViewById(R.id.imageView38);
        p32 = (ImageView)findViewById(R.id.imageView39);
        p33 = (ImageView)findViewById(R.id.imageView40);
        p34 = (ImageView)findViewById(R.id.imageView41);
        p35 = (ImageView)findViewById(R.id.imageView42);
        p36 = (ImageView)findViewById(R.id.imageView43);
        p37 = (ImageView)findViewById(R.id.imageView44);
        p38 = (ImageView)findViewById(R.id.imageView45);
        horiz1 = (LinearLayout) findViewById(R.id.hor1);
        retry = (ImageView) findViewById(R.id.imageViewRetry);
        home = (ImageView) findViewById(R.id.imageViewHomeCho);

        p0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p0.setVisibility(View.INVISIBLE);
                p1.setVisibility(View.INVISIBLE);
                p2.setVisibility(View.INVISIBLE);
                p3.setVisibility(View.INVISIBLE);
                p4.setVisibility(View.INVISIBLE);
                p5.setVisibility(View.INVISIBLE);
                p6.setVisibility(View.INVISIBLE);
                p7.setVisibility(View.INVISIBLE);
                p8.setVisibility(View.INVISIBLE);
                p9.setVisibility(View.INVISIBLE);
            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p0.setVisibility(View.INVISIBLE);
                p1.setVisibility(View.INVISIBLE);
                p2.setVisibility(View.INVISIBLE);
                p3.setVisibility(View.INVISIBLE);
                p4.setVisibility(View.INVISIBLE);
                p5.setVisibility(View.INVISIBLE);
                p6.setVisibility(View.INVISIBLE);
                p7.setVisibility(View.INVISIBLE);
                p8.setVisibility(View.INVISIBLE);
                p9.setVisibility(View.INVISIBLE);
            }
        });



        p19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p19.setVisibility(View.INVISIBLE);
                p20.setVisibility(View.INVISIBLE);
                p21.setVisibility(View.INVISIBLE);
                p22.setVisibility(View.INVISIBLE);
                p23.setVisibility(View.INVISIBLE);
                p24.setVisibility(View.INVISIBLE);
                p25.setVisibility(View.INVISIBLE);
                p26.setVisibility(View.INVISIBLE);
                p27.setVisibility(View.INVISIBLE);
                p28.setVisibility(View.INVISIBLE);
            }
        });
        p20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p19.setVisibility(View.INVISIBLE);
                p20.setVisibility(View.INVISIBLE);
                p21.setVisibility(View.INVISIBLE);
                p22.setVisibility(View.INVISIBLE);
                p23.setVisibility(View.INVISIBLE);
                p24.setVisibility(View.INVISIBLE);
                p25.setVisibility(View.INVISIBLE);
                p26.setVisibility(View.INVISIBLE);
                p27.setVisibility(View.INVISIBLE);
                p28.setVisibility(View.INVISIBLE);
            }
        });

        p29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p29.setVisibility(View.INVISIBLE);
                p30.setVisibility(View.INVISIBLE);
                p31.setVisibility(View.INVISIBLE);
                p32.setVisibility(View.INVISIBLE);
                p33.setVisibility(View.INVISIBLE);
                p34.setVisibility(View.INVISIBLE);
                p35.setVisibility(View.INVISIBLE);
                p36.setVisibility(View.INVISIBLE);
                p37.setVisibility(View.INVISIBLE);
                p38.setVisibility(View.INVISIBLE);
            }
        });
        p30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p29.setVisibility(View.INVISIBLE);
                p30.setVisibility(View.INVISIBLE);
                p31.setVisibility(View.INVISIBLE);
                p32.setVisibility(View.INVISIBLE);
                p33.setVisibility(View.INVISIBLE);
                p34.setVisibility(View.INVISIBLE);
                p35.setVisibility(View.INVISIBLE);
                p36.setVisibility(View.INVISIBLE);
                p37.setVisibility(View.INVISIBLE);
                p38.setVisibility(View.INVISIBLE);
            }
        });

        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p0.setVisibility(View.VISIBLE);
                p1.setVisibility(View.VISIBLE);
                p2.setVisibility(View.VISIBLE);
                p3.setVisibility(View.VISIBLE);
                p4.setVisibility(View.VISIBLE);
                p5.setVisibility(View.VISIBLE);
                p6.setVisibility(View.VISIBLE);
                p7.setVisibility(View.VISIBLE);
                p8.setVisibility(View.VISIBLE);
                p9.setVisibility(View.VISIBLE);
                p19.setVisibility(View.VISIBLE);
                p20.setVisibility(View.VISIBLE);
                p21.setVisibility(View.VISIBLE);
                p22.setVisibility(View.VISIBLE);
                p23.setVisibility(View.VISIBLE);
                p24.setVisibility(View.VISIBLE);
                p25.setVisibility(View.VISIBLE);
                p26.setVisibility(View.VISIBLE);
                p27.setVisibility(View.VISIBLE);
                p28.setVisibility(View.VISIBLE);
                p29.setVisibility(View.VISIBLE);
                p30.setVisibility(View.VISIBLE);
                p31.setVisibility(View.VISIBLE);
                p32.setVisibility(View.VISIBLE);
                p33.setVisibility(View.VISIBLE);
                p34.setVisibility(View.VISIBLE);
                p35.setVisibility(View.VISIBLE);
                p36.setVisibility(View.VISIBLE);
                p37.setVisibility(View.VISIBLE);
                p38.setVisibility(View.VISIBLE);
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