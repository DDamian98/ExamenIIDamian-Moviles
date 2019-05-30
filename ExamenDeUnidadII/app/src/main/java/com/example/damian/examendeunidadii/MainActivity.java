package com.example.damian.examendeunidadii;

import android.graphics.drawable.AnimatedStateListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    public static final String GET = "http://10.0.2.2:8080/examen/examen.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

        WebView web_mail = (WebView)findViewById(R.id.web);
        WebSettings webSettings = web_mail.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web_mail.addJavascriptInterface(new Noticia(getBaseContext()),"titulo");
        web_mail.setWebViewClient(new MyWebViewCliente());
        web_mail.loadUrl(GET);


    }
    private class MyWebViewCliente extends WebViewClient{
        @Override public boolean shouldOverrideUrlLoading(WebView view, String url){
          return false;

        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
