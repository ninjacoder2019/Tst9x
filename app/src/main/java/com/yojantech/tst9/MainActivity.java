package com.yojantech.tst9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton chocolate;
    ImageView next, prev, home;
    static String whichchoco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_main);

        chocolate = (ImageButton)findViewById(R.id.imageViewChocolate);
        next = (ImageView)findViewById(R.id.imageViewNext);
        prev = (ImageView)findViewById(R.id.imageViewPrev);
        home = (ImageView)findViewById(R.id.imageViewMainHome);

        chocolate.setTag("dairymilk");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chocolate.getTag() == "dairymilk"){

                    chocolate.setRotation(90);
                    chocolate.setTag("mars");
                    chocolate.setImageResource(R.drawable.marspacket);

                }
                else if(chocolate.getTag() == "mars"){

                    chocolate.setRotation(90);
                    chocolate.setTag("snicker");
                    chocolate.setImageResource(R.drawable.snickerspaket);

                }
                else if(chocolate.getTag() == "snicker"){

                    chocolate.setRotation(90);
                    chocolate.setTag("twix");
                    chocolate.setImageResource(R.drawable.twixpacket);

                }
                else if(chocolate.getTag() == "twix"){

                    chocolate.setRotation(90);
                    chocolate.setTag("bounty");
                    chocolate.setImageResource(R.drawable.bountypacket);

                }
                else if(chocolate.getTag() == "bounty"){

                    chocolate.setRotation(90);
                    chocolate.setTag("redball");
                    chocolate.setImageResource(R.drawable.redball);

                }
                else if(chocolate.getTag() == "redball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("blueball");
                    chocolate.setImageResource(R.drawable.blueball);

                }
                else if(chocolate.getTag() == "blueball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("purpleball");
                    chocolate.setImageResource(R.drawable.purpleball);

                }
                else if(chocolate.getTag() == "purpleball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("greenball");
                    chocolate.setImageResource(R.drawable.greenball);

                }
                else if(chocolate.getTag() == "greenball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("yellowball");
                    chocolate.setImageResource(R.drawable.yellowballs);

                }

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chocolate.getTag() == "yellowball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("greenball");
                    chocolate.setImageResource(R.drawable.greenball);

                }
                else if(chocolate.getTag() == "greenball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("purpleball");
                    chocolate.setImageResource(R.drawable.purpleball);

                }
                else if(chocolate.getTag() == "purpleball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("blueball");
                    chocolate.setImageResource(R.drawable.blueball);

                }
                else if(chocolate.getTag() == "blueball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("redball");
                    chocolate.setImageResource(R.drawable.redball);

                }
                else if(chocolate.getTag() == "redball"){

                    chocolate.setRotation(90);
                    chocolate.setTag("bounty");
                    chocolate.setImageResource(R.drawable.bountypacket);

                }
                else if(chocolate.getTag() == "bounty"){

                    chocolate.setRotation(90);
                    chocolate.setTag("twix");
                    chocolate.setImageResource(R.drawable.twixpacket);

                }
                else if(chocolate.getTag() == "twix"){

                    chocolate.setRotation(90);
                    chocolate.setTag("snicker");
                    chocolate.setImageResource(R.drawable.snickerspaket);

                }
                else if(chocolate.getTag() == "snicker"){

                    chocolate.setRotation(90);
                    chocolate.setTag("mars");
                    chocolate.setImageResource(R.drawable.marspacket);

                }
                else if(chocolate.getTag() == "mars"){

                    chocolate.setRotation(0);
                    chocolate.setTag("dairymilk");
                    chocolate.setImageResource(R.drawable.bublydairymilk);

                }



            }
        });

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(chocolate.getTag() == "dairymilk"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Dairy Milk", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "mars"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Mars", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "twix"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Twix", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "snicker"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Snickers", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "bounty"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Bounty", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "redball"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Red Gum Ball", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "blueball"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Blue Gum Ball", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "yellowball"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Yellow Gum Ball", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "greenball"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Green Gum Ball", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }
                else if(chocolate.getTag() == "purpleball"){

                    whichchoco = chocolate.getTag().toString();
                    Toast.makeText(MainActivity.this, "Purple Gum Ball", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(), MakeChocolate.class);
                    startActivity(i);

                }

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