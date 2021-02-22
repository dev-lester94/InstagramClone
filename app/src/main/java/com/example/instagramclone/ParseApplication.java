package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TdOCHJR2OfSuLCEROO6kzPK0hxe8dr16hfC5j0Em")
                .clientKey("VMorK2nr1IbyJoOvKxtUeYHIWDZK6DOJQ5RxQJPO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
