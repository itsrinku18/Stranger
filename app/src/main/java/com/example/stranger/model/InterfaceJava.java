package com.example.stranger.model;

import android.webkit.JavascriptInterface;

import com.example.stranger.activites.CallActivity;

public class InterfaceJava {
    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity){
        this.callActivity=callActivity;
    }
    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();

    }
}
