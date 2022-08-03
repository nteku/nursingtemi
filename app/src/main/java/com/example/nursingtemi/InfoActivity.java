package com.example.nursingtemi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_info);
        webView = findViewById(R.id.urlButton);
        webView.setVisibility(View.INVISIBLE);

        webView.setOnClickListener((v)->{
            webView.setVisibility(View.VISIBLE);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.nursing.arizona.edu/simulated-learning");
        });
    }
}