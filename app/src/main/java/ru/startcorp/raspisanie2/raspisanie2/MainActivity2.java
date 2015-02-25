package ru.startcorp.raspisanie2.raspisanie2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity2 extends Activity {

    private WebView mWebView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

         /*Находим WebView элемент по его id*/
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setScrollbarFadingEnabled(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        // указываем страницу загрузки
        Bundle extras = getIntent().getExtras();
        String page= extras.getString("page");
        mWebView.loadUrl(page);

        mWebView.setWebViewClient(new HelloWebViewClient());
    }

    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl){
        /*остановка загрузки и отображение страницы error.html из папки “assets”*/
            view.stopLoading();
            view.loadUrl(String.format("file:///android_asset/error.html", Uri.encode(String.valueOf(errorCode)), Uri.encode(description), Uri.encode(failingUrl)));

        }

    }

}