package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	//MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle TravisLoveBecon) {
	
		super.onCreate(TravisLoveBecon);
		setContentView(R.layout.splash);
		//ourSong = MediaPlayer.create(Splash.this, R.raw.bethovan);
		//ourSong.start();
		Thread timer = new Thread() { 
			public void run(){
			try{
				sleep(5000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}finally {
				Intent openStartingPoint = new Intent("com.example.helloworld.MENU"); 
				startActivity(openStartingPoint);
			}
		}
		};
		timer.start();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//ourSong.release();
		finish();
	}
	
	

}
