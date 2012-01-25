package com.ollendev.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends Activity {
    private static final String TAG = HelloWorldActivity.class.getSimpleName();
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//This is a comment
    	Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}