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

	public static final String KEY_ONE = "KEY_ONE";
	private EditText message;
	private Button send;
	Intent i;


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_message);
		
		i = new Intent(this,DisplayMessage.class);	
		
		message = (EditText) findViewById(R.id.message);
		send = (Button) findViewById(R.id.send);
		

	


	
	OnClickListener mListener = new OnClickListener(){
		public void onClick(View v){
			String s = message.getText().toString();
			startDisplay(s);
			}
		
	};
	
	
	send.setOnClickListener(mListener);
	
}
	
	private void startDisplay(String s){
		Intent i = new Intent(this,DisplayMessage.class);
		i.putExtra(KEY_ONE,s);
		startActivity(i);					
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.send_message, menu);
		return true;
	}
}


