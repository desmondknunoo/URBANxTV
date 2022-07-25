package com.dkn.desmondenergeo.urbanxtv;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MusicWebClient extends WebViewClient {
	 WebView myWebView;
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        if(Uri.parse(url).getHost().endsWith("audiomack.com/artist/urbanxtv-live")) {
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

