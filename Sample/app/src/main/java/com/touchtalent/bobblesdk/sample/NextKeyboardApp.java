package com.touchtalent.bobblesdk.sample;

import android.app.Application;

import com.touchtalent.bobbleime.sdk.BobbleIMESDK;
import com.touchtalent.bobbleime.services.BobbleIME;

public class NextKeyboardApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BobbleIMESDK.initialise(this);
    }
}
