package com.example.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import inputcells.PictureInputCellFragment;

public class BootActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_boot);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.boot, menu);
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
	@Override
	protected void onResume(){
		super.onResume();
		
		Handler handler = new Handler();
		handler.postDelayed(new Runnable(){
			public void run(){
				startLoginActivity();
			}

		},1000);
	}
	
		 void startLoginActivity() {
			 Intent intent = new Intent(this, LoginActivity.class);
			 startActivity(intent);
			 finish();
		}
		
		 void startRegisterActivity(){
			 Intent intent = new Intent(this, RegisterActivity.class);
			 startActivity(intent);
			 finish();
		 }
		 
		 void startPicture(){
			 Intent intent = new Intent(this, PictureInputCellFragment.class);
			 startActivity(intent);
			 finish();
		 }
	
}
