package com.ollendev.helloworld;

import android.app.Activity;
import android.os.Bundle;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//This is a comment
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}