package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	Button button;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.menu);


	 button = (Button) findViewById(R.id.Button03);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent
                        (MenuActivity.this, Donate.class);
                    startActivity(intent); 
            }
            
        });


   	 button = (Button) findViewById(R.id.Button02);
           button.setOnClickListener(new OnClickListener() {

               @Override
               public void onClick(View arg0) {

                   Intent intent = new Intent
                           (MenuActivity.this, Developer.class);
                       startActivity(intent); 
               }
               
           });
           

      	 button = (Button) findViewById(R.id.Button01);
              button.setOnClickListener(new OnClickListener() {

                  @Override
                  public void onClick(View arg0) {

                      Intent intent = new Intent
                              (MenuActivity.this, Terms.class);
                          startActivity(intent); 
                  }
                  
              });
              

         	 button = (Button) findViewById(R.id.button1);
                 button.setOnClickListener(new OnClickListener() {

                     @Override
                     public void onClick(View arg0) {

                         Intent intent = new Intent
                                 (MenuActivity.this, OpenSource.class);
                             startActivity(intent); 
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