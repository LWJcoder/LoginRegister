package com.example.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import inputcells.SimpleTextInputCell;

public class LoginActivity extends Activity{
	private Button register;
	private SimpleTextInputCell userName;
	private SimpleTextInputCell psw;
	protected void onCreate(Bundle sis){
		super.onCreate(sis);;
		setContentView(R.layout.activity_login);
		
		userName = (SimpleTextInputCell) getFragmentManager().findFragmentById(R.id.username);
		psw = (SimpleTextInputCell) getFragmentManager().findFragmentById(R.id.psw);
		
	
	}
	
	@Override 
	public void onResume(){
		super.onResume();
		
		register = (Button) findViewById(R.id.register);
		register.setOnClickListener(new OnClickListener(){  
			  
		    @Override  
		    public void onClick(View v) {  
		    	toRegister();
		    }

		      
		}  );  
		
		userName.setLabelText("用户名");
		userName.setLabelText("用户名");
		userName.setIsPsw(false);
		psw.setLabelText("密码");
		psw.setHintText("输入密码");
		psw.setIsPsw(true);
		
		
	}

	private void toRegister() {
		 Intent intent = new Intent(this, RegisterActivity.class);
		 startActivity(intent);
		 finish();
	}  
	

}


