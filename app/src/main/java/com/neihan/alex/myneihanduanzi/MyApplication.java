package com.neihan.alex.myneihanduanzi;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.neihan.alex.myneihanduanzi.utils.Utils;

/**
 * Created by Alex on 2017/6/19.
 * Alex
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        Fresco.initialize(this);
    }
}
