package com.example.firstroadbusiness;

import android.app.Application;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;

public class App extends Application {

    private final String AppId = "ec74e102d87bc4a173611258c118b07e";

    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, AppId);
    }

}
