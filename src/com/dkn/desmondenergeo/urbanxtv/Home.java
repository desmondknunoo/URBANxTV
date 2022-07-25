package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Video;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Home extends Activity {

	ImageButton imagebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
	

		 imagebutton = (ImageButton) findViewById(R.id.imageButton5);
	        imagebutton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (Home.this, Live.class);
	                    startActivity(intent); 
	            }
	            
	        });

			 imagebutton = (ImageButton) findViewById(R.id.imageButton9);
		        imagebutton.setOnClickListener(new OnClickListener() {

		            @Override
		            public void onClick(View arg0) {

		                Intent intent = new Intent
		                        (Home.this, Radio.class);
		                    startActivity(intent); 
		            }
		            
		        });
	
	 imagebutton = (ImageButton) findViewById(R.id.imageButton6);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, Apparel.class);
                 startActivity(intent); 
         }
         
     });
     imagebutton = (ImageButton) findViewById(R.id.imageButton7);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, com.dkn.desmondenergeo.urbanxtv.Video.class);
                 startActivity(intent); 
         }
         
     });
     imagebutton = (ImageButton) findViewById(R.id.imageButton2);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, Events.class);
                 startActivity(intent); 
         }
         
     });
     
	
	
     imagebutton = (ImageButton) findViewById(R.id.imageButton8);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, Request.class);
                 startActivity(intent); 
         }
         
     });
     
     imagebutton = (ImageButton) findViewById(R.id.imageButton4);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, Music.class);
                 startActivity(intent); 
         }
         
     });
     
	
     imagebutton = (ImageButton) findViewById(R.id.imageButton1);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, About.class);
                 startActivity(intent); 
         }
         
     });
	
     imagebutton = (ImageButton) findViewById(R.id.imageButton3);
     imagebutton.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent intent = new Intent
                     (Home.this, ContactUs.class);
                 startActivity(intent); 
         }
         
     });
	
	
	
	
	}
	
			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		 Intent intent = new Intent
                 (Home.this, MenuActivity.class);
             startActivity(intent);
			return false;
	}
	@Override
	protected void onStart() {
	super.onStart();
	}
	
	/** Called when the activity has become visible. */
	@Override
	protected void onResume() {
	super.onResume();
	}
	
	/** Called when another activity is taking focus. */
	@Override
	protected void onPause() {
	super.onPause();
	
	}
	/** Called when the activity is no longer visible. */
	@Override
	protected void onStop() {
	super.onStop();
	
	}
	/** Called just before the activity is destroyed. */
	@Override
	public void onDestroy() {
	super.onDestroy();
	
	}}