package com.hoodparkhockeyleague;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {
	//private final String TAG = "Schedule";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void goToSc (View view) {
		goToUrl ("https://sites.google.com/site/hphlsummer2014/team-schedules");
	}
	
	public void goToRo (View view) {
		goToUrl ("https://sites.google.com/site/hphlsummer2014/about-the-team");
	}
	
	public void goToHo (View view) {
		goToUrl ("https://sites.google.com/site/hphlsummer2014/");
	}
	
	public void goToVi (View view) {
		goToUrl ("https://www.youtube.com/playlist?list=PLiRHqM8VVUiIqCImABdGPt_yhgY1ywVgJ");
	}
	
	private void goToUrl (String url) {
		Uri uriUrl = Uri.parse(url);
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
		startActivity(launchBrowser);
	}
	
	static boolean active = false;
	@Override
	public void onStart() {
	   super.onStart();
	   active = true;
	}
	 
	@Override
	public void onStop() {
	   super.onStop();
	   active = false;
	}
	public static boolean isActive(){
	    return active;
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
