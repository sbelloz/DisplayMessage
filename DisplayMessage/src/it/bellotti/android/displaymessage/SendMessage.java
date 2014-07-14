package it.bellotti.android.displaymessage;

import com.example.displaymessage.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class SendMessage extends Activity {
	
	private EditText mEditMessage;
	private Button mSendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_message);
				
		//Init views
		mEditMessage = (EditText) findViewById(R.id.message);
		mSendButton = (Button) findViewById(R.id.send);		
	
		mSendButton.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				String s = mEditMessage.getText().toString();
				startDisplayMessage(s);
			}
		});
	
}
	
	private void startDisplayMessage(String s){
		Intent i = new Intent(this, DisplayMessage.class);
		i.putExtra(Constants.STRING_KEY, s);
		startActivity(i);					
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.send_message, menu);
		return true;
	}
}


