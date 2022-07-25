package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Developer extends Activity {
	ImageButton imagebutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developer);
		


		 imagebutton = (ImageButton) findViewById(R.id.ImageButton041);
	        imagebutton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {
	            	

	            	Intent emailIntent = new Intent(Intent.ACTION_SEND);
	    			emailIntent.setType("text/plain");
	    			emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"desmondenergeo@gmail.com"});
	    			emailIntent.putExtra(Intent.EXTRA_SUBJECT, "The Developer: URBΔNxTV app");
	    			emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi Desmond Energeo!\n");
	    			
	    			emailIntent.setType("message/rfc822");
	    			
	    			try {
	    			startActivity(Intent.createChooser(emailIntent, "Email the Developer using..."));
	    		
	    			}
            
         catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getActivity(),
                    "No email clients installed.",
                    Toast.LENGTH_SHORT).show();
        }

    
}

				private Context getActivity() {
					// TODO Auto-generated method stub
					return null;
				}});
	}}