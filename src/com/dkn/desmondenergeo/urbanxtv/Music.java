package com.dkn.desmondenergeo.urbanxtv;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Music extends Activity { 
	 
    private WebView mWebView; 


    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.music); 
		getActionBar().setDisplayHomeAsUpEnabled(true);
	



        mWebView = (WebView) findViewById(R.id.activity_main_webview); 
        mWebView.loadUrl("http://m.audiomack.com/artist/urbanxtv-live"); 
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new com.dkn.desmondenergeo.urbanxtv.EventsWebClient(){ 
            @Override 
            public void onPageFinished(WebView view, String url) { 
                //hide loading image 
                findViewById(R.id.progressBar1).setVisibility(View.GONE); 
                //show webview 
                findViewById(R.id.activity_main_webview).setVisibility(View.VISIBLE); 
            }}); 
 

    } 

     @Override 
    public void onBackPressed() { 
        if(mWebView.canGoBack()) { 
            mWebView.goBack(); 
        } else { 
            super.onBackPressed(); 
        } 
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