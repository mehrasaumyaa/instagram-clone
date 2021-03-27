package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

//initializes Parse SDK as soon as app is created
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        //register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qHFCxGrzbj0mjPBPqS8OQ2F32RH2jsYZncnJB2Yk")
                .clientKey("KtWblmOeErPM3C2WcvQGccU7eWjVMcStN02o2JAg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}