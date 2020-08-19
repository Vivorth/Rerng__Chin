package com.example.rerngchin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class nisaisne_daptep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisaisne_daptep);
        AdView adView = findViewById(R.id.adview);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        WebView setec1 = findViewById(R.id.setec1);
        setec1.reload();
        setec1.setWebViewClient(new nisaisne_daptep.Browser());
        setec1.getSettings().setJavaScriptEnabled(true);
        setec1.getSettings().setDomStorageEnabled(true);
        setec1.getSettings().setLoadsImagesAutomatically(true);
        setec1.setWebChromeClient(new nisaisne_daptep.MyWebClient());
        setec1.getSettings().setPluginState(WebSettings.PluginState.ON);
        setec1.loadUrl("https://movie-khmer.com/nisai-snae-dav-tep/");
        setec1.getSettings().setAllowContentAccess(true);
        setec1.getSettings().setMediaPlaybackRequiresUserGesture(false);  //important because in setec website, video is not showing. But after adding this it works.
        setec1.clearView();
        setec1.getSettings().setUseWideViewPort(true);
        setec1.getSettings().setLoadWithOverviewMode(true);

    }
    class Browser
            extends WebViewClient
    {
        Browser() {}

        public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
        {
            paramWebView.loadUrl(paramString);
            return true;
        }
    }

    public class MyWebClient
            extends WebChromeClient
    {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        public MyWebClient() {}

        public Bitmap getDefaultVideoPoster()
        {
            if (getApplicationContext() == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView()
        {
            ((FrameLayout)nisaisne_daptep.this.getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            nisaisne_daptep.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            nisaisne_daptep.this.setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
        {
            if (this.mCustomView != null)
            {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
            this.mOriginalSystemUiVisibility = nisaisne_daptep.this.getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = nisaisne_daptep.this.getRequestedOrientation();
            this.mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout)nisaisne_daptep.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            nisaisne_daptep.this.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }
}