package com.example.root.tictactoe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    int turn=1;
    String temp;
    HashMap<String, Integer> check = new HashMap<String, Integer>();
    HashMap<String, Integer> yallow = new HashMap<String, Integer>();
    HashMap<String, Integer> red = new HashMap<String, Integer>();

   boolean flag=false;
    int cnt=0;


    public void resetAll(View view)
    {

        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
        layout.setVisibility(View.INVISIBLE);
         turn=1;
         flag=false;
         cnt=0;

        for(int i=0;i<=8;i++)
        {
            temp=Integer.toString(i);
            check.put(temp,0);
            red.put(temp,0);
            yallow.put(temp,0);
        }

        GridLayout grid=(GridLayout)findViewById(R.id.gridLayout);

        for(int i=0;i<grid.getChildCount();i++)
        {
            ((ImageView)grid.getChildAt(i)).setImageResource(0);
        }

    }

    public void change(View view)
    {
        ImageView img=(ImageView) view;

        String tagval=img.getTag().toString();


            System.out.println(cnt);

            if(check.get(tagval)==0 && !flag)
            {
                img.setTranslationY(-1000f);

                if(turn==1)
                {
                    img.setImageResource(R.drawable.yellow);
                    img.animate().translationYBy(1000f).setDuration(300);

                    yallow.put(tagval,1);

                    if( yallow.get("0")==1 &&  yallow.get("1")==1 &&  yallow.get("2")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("0")==1 &&  yallow.get("3")==1 &&  yallow.get("6")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("1")==1 &&  yallow.get("4")==1 &&  yallow.get("7")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("2")==1 &&  yallow.get("5")==1 &&  yallow.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("3")==1 &&  yallow.get("4")==1 &&  yallow.get("5")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(view.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("6")==1 &&  yallow.get("7")==1 &&  yallow.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                   else  if( yallow.get("2")==1 &&  yallow.get("4")==1 &&  yallow.get("6")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( yallow.get("0")==1 &&  yallow.get("4")==1 &&  yallow.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"yallow is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }

                    turn=2;

                }
                else
                {
                    img.setImageResource(R.drawable.red);
                    img.animate().translationYBy(1000f).setDuration(300);

                    red.put(tagval,1);

                    if( red.get("0")==1 &&  red.get("1")==1 &&  red.get("2")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("0")==1 &&  red.get("3")==1 &&  red.get("6")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("1")==1 &&  red.get("4")==1 &&  red.get("7")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("2")==1 &&  red.get("5")==1 && red.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("3")==1 && red.get("4")==1 && red.get("5")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("6")==1 &&  red.get("7")==1 &&  red.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else  if( red.get("2")==1 &&  red.get("4")==1 &&  red.get("6")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }
                    else if( red.get("0")==1 &&  red.get("4")==1 &&  red.get("8")==1 )
                    {
                        Toast.makeText(getApplicationContext(),"red is winner!!!!",Toast.LENGTH_LONG).show();
                        LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                        layout.setVisibility(View.VISIBLE);
                        flag=true;
                    }

                    turn=1;

                }

               check.put(tagval,1);
                cnt++;

            }

            if(cnt==9 && !flag)
            {
                Toast.makeText(getApplicationContext(),"Match draw!!!!!!",Toast.LENGTH_LONG).show();
                LinearLayout layout=(LinearLayout)findViewById(R.id.tryAgain);
                layout.setVisibility(View.VISIBLE);
            }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         check.put("0",0);
        check.put("1",0);
        check.put("2",0);
        check.put("3",0);
        check.put("4",0);
        check.put("5",0);
        check.put("6",0);
        check.put("7",0);
        check.put("8",0);


        red.put("0",0);
        red.put("1",0);
        red.put("2",0);
        red.put("3",0);
        red.put("4",0);
        red.put("5",0);
        red.put("6",0);
        red.put("7",0);
        red.put("8",0);

        yallow.put("0",0);
        yallow.put("1",0);
        yallow.put("2",0);
        yallow.put("3",0);
        yallow.put("4",0);
        yallow.put("5",0);
        yallow.put("6",0);
        yallow.put("7",0);
        yallow.put("8",0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
