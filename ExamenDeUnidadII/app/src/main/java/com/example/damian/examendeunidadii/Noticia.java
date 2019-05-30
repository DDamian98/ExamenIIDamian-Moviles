package com.example.damian.examendeunidadii;


import android.content.Context;
import android.webkit.JavascriptInterface;

public class Noticia {
    Context context;
    /* Instancia la Interface e inicia el contexto */
    Noticia(Context c){
        context = c;


    }

    private String titulo;
    @JavascriptInterface
    public String getTitulo(){
        return titulo;
    }


}
