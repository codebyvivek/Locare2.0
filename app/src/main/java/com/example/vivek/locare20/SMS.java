package com.example.vivek.locare20;

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;


public class SMS extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://www.google.co.in/maps/");
    }




}