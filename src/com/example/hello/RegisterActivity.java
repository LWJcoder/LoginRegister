package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import inputcells.SimpleTextInputCell;

public class RegisterActivity extends Activity{
	
	private SimpleTextInputCell fragInputAccount;
	private SimpleTextInputCell fragInputCellPsw;
	private SimpleTextInputCell fragInputPswRepeat;

	@Override 
	public void onCreate(Bundle sts){
		super.onCreate(sts);
		
		setContentView(R.layout.activity_register);
		
		fragInputAccount = (SimpleTextInputCell) getFragmentManager().findFragmentById(R.id.frag1);
		fragInputCellPsw = (SimpleTextInputCell) getFragmentManager().findFragmentById(R.id.frag2);
		fragInputPswRepeat = (SimpleTextInputCell) getFragmentManager().findFragmentById(R.id.frag3);
	}
	
	@Override 
	public void onResume(){
		super.onResume();
		
		Button register = (Button) findViewById(R.id.register);
		register.setOnClickListener(new OnClickListener(){  
			  
		    @Override  
		    public void onClick(View v) {  
		    	checkPswIsSame();
		    }

		      
		}  );  
		
		
		fragInputAccount.setLabelText("用户名");
		fragInputAccount.setLabelText("用户名");
		fragInputAccount.setIsPsw(false);
		fragInputCellPsw.setLabelText("密码");
		fragInputCellPsw.setHintText("输入密码");
		fragInputCellPsw.setIsPsw(true);
		fragInputPswRepeat.setLabelText("重复密码");
		fragInputPswRepeat.setHintText("再次输入密码");
		fragInputPswRepeat.setIsPsw(true);
		
		
	}

	protected void checkPswIsSame() {
		//检查两次密码是否相同
		
		
	}
}
