package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Donate extends Activity {
	
	Button send;
	EditText irequest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.donate);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		send=(Button) findViewById(R.id.button1);
		irequest=(EditText) findViewById(R.id.EditText01);

        send.setOnClickListener(new OnClickListener() {

		  @Override
		  public void onClick(View v) {
			  // TODO Auto-generated method stub

			  Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
			  emailIntent.setType("plain/text");
              emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"urbanxtv1@gmail.com"});                             
              emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Donate: URBΔNxTV app");
              emailIntent.putExtra(Intent.EXTRA_TEXT, irequest.getText());
              Donate.this.startActivity(Intent.createChooser(emailIntent, "Send Donation email using..."));


		 


		                        }


		                });


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