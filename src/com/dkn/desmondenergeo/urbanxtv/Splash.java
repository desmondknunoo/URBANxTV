package com.dkn.desmondenergeo.urbanxtv;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Splash extends Activity {

    private Thread mSplashThread;

 

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

       setContentView(R.layout.splash); 
        //ActionBar actionBar = getActionBar();
        //actionBar.hide();

        final Splash SPlashScreen = this;

 

            mSplashThread =  new Thread(){

            @Override

            public void run(){

                try {

                    synchronized(this){

 

                        wait(4000);

                    }

                }

                catch(InterruptedException ex){

                }

 

                finish();

 

                Intent intent = new Intent();

                intent.setClass(SPlashScreen, Home.class);

                startActivity(intent);

 

            }

        };

 

        mSplashThread.start();

    }

 

 

    @Override

 

    public boolean onTouchEvent(MotionEvent evt)

    {

        if(evt.getAction() == MotionEvent.ACTION_DOWN)

        {

            synchronized(mSplashThread){

                mSplashThread.notifyAll();

            }

        }

        return true;

    }}

