package com.hoodparkhockeyleague;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splashscreen);
		

		// Thread for displaying the splash screen
		Thread splash_screen = new Thread() {
			public void run() {
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					startActivity(new Intent(getApplicationContext(),
							MainActivity.class));
					finish();
				}
			}
		};
		splash_screen.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
