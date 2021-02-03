package com.irvan.kwsgmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WebView webviewkwsg;
    WebSettings websettingkwsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewkwsg     = (WebView)findViewById(R.id.webView1);
        websettingkwsg  = webviewkwsg.getSettings();
        webviewkwsg.setWebViewClient(new WebViewClient());
        webviewkwsg.loadUrl("silahkan tulis link web yang sudah di hosting di sini");
    }
}