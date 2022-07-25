package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactUs extends Activity {
	ImageButton imagebutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		


		 imagebutton = (ImageButton) findViewById(R.id.ImageButton02);
	        imagebutton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {
	            	

			Intent emailIntent = new Intent(Intent.ACTION_SEND);
			emailIntent.setType("text/plain");
			emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"urbanxtv1@gmail.com"});
			emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact Us: URBΔNxTV app");
			emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello URBΔNxTV!\n");
			
			emailIntent.setType("message/rfc822");
			
			try {
			startActivity(Intent.createChooser(emailIntent, "Email URBΔNxTV using..."));
		
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
	
	
	imagebutton = (ImageButton) findViewById(R.id.ImageButton04); 
	imagebutton.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View arg0) {
           	


        	   Intent ig = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com/urbanxtv/"));
        	
        	   
        	  
        	   
		

		try {
		startActivity(Intent.createChooser(ig, "Open Instagram using..."));
	
		}
       
    catch (android.content.ActivityNotFoundException ex) {
       Toast.makeText(getActivity(),
               "No browser available.",
               Toast.LENGTH_SHORT).show();
   }


}

			private Context getActivity() {
				// TODO Auto-generated method stub
				return null;
			}});


	imagebutton = (ImageButton) findViewById(R.id.ImageButton05); 
	imagebutton.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View arg0) {
           	


        	   Intent tw = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com/urbanxtv/"));
        	   
        	   
        	  
        	   
		

		try {
		startActivity(Intent.createChooser(tw, "Open Twitter using..."));
	
		}
       
    catch (android.content.ActivityNotFoundException ex) {
       Toast.makeText(getActivity(),
               "No browser available",
               Toast.LENGTH_SHORT).show();
   }


}

			private Context getActivity() {
				// TODO Auto-generated method stub
				return null;
			}});
	
	
			imagebutton = (ImageButton) findViewById(R.id.ImageButton06); 
			imagebutton.setOnClickListener(new OnClickListener() {

		           @Override
		           public void onClick(View arg0) {
		           	


		        	   Intent fb = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/urbanxtv/"));
		        	   
		        	   
		        	  
		        	   
				

				try {
				startActivity(Intent.createChooser(fb, "Open Facebook using..."));
			
				}
		       
		    catch (android.content.ActivityNotFoundException ex) {
		       Toast.makeText(getActivity(),
		               "No browser available.",
		               Toast.LENGTH_SHORT).show();
		   }


		}

					private Context getActivity() {
						// TODO Auto-generated method stub
						return null;
					}});
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