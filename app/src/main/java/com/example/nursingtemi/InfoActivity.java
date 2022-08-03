package com.example.nursingtemi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_info);
        //webView = findViewById(R.id.urlButton);
       // webView.setWebViewClient(new WebViewClient());
        //webView.setVisibility(View.INVISIBLE);



        //webView.loadUrl("https://www.nursing.arizona.edu/simulated-learning");

        final Button button = (Button)findViewById(R.id.urlButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                webView = (WebView) findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://www.nursing.arizona.edu/simulated-learning");
            }
        });





    }

}