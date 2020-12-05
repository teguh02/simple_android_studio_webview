package com.example.myfisrtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        this.webview = mywebview;
        WebSettings webSettings = this.webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        this.webview.loadUrl("http://www.gudangtasorichina.com/");
        this.webview.setWebViewClient(new WebViewClient());
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (this.webview.canGoBack()) {
                        this.webview.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}