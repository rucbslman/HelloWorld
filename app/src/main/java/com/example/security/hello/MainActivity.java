package com.example.security.hello;

import android.app.Activity;
import android.os.Bundle;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

public class MainActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AVOSCloud.initialize(this, "3HleCePyFlgWFRQAGY2fm3md-gzGzoHsz", "HAc1btNU4MMxSv7SILrcwzVc");

        AVAnalytics.trackAppOpened(getIntent());
        AVObject textObject = new AVObject("TextObject");
        textObject.add("name","bsl");
        textObject.add("age","21");
        textObject.saveInBackground();
    }
}
