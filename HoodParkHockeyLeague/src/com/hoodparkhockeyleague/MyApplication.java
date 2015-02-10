package com.hoodparkhockeyleague;

import android.app.Application;
import com.pushbots.push.Pushbots;

public class MyApplication extends Application {
	
	private String SENDER_ID = "978235585705";
	private String PUSHBOTS_APPLICATION_ID = "54bd1f731d0ab1251f8b4597";
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Pushbots.init(this, SENDER_ID, PUSHBOTS_APPLICATION_ID);
		Pushbots.getInstance().setMsgReceiver(customHandler.class);
	}
	
	
		
	}
	
	
	


