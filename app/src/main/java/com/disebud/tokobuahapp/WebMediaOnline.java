package com.disebud.tokobuahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebMediaOnline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_media_online);

        WebView webportal = (WebView) findViewById(R.id.webPortal);

        webportal.getSettings().getLoadsImagesAutomatically();
        webportal.getSettings().getJavaScriptEnabled();
        webportal.getSettings().getDomStorageEnabled();

        webportal.getSettings().setSupportZoom(true);
        webportal.getSettings().getDisplayZoomControls();
        webportal.getSettings().getBuiltInZoomControls();

        webportal.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webportal.setWebViewClient(new WebViewClient());

        // mengambil nilai parameter yang diberikan dari activity Main (GridView)
        String URL = getIntent().getStringExtra("urlWeb");
        webportal.loadUrl(URL);

    }

    public void homeGo(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}