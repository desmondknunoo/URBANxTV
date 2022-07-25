package com.dkn.desmondenergeo.urbanxtv;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventsWebClient extends WebViewClient {
	 WebView myWebView;
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        if(Uri.parse(url).getHost().endsWith("urbanxtv.tumblr.com/")) {
	            return false;
	        }
	    
	   
		myWebView.setWebViewClient(new WebViewClient() {
	            @Override
	            public boolean shouldOverrideUrlLoading(WebView view, String url) {
	                view.loadUrl(url);
	                return false;
	                
	            }
	        });


	        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
	        view.getContext().startActivity(intent);
	        return true;
	    }
	    
	}

