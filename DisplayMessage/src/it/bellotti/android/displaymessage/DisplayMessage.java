package it.bellotti.android.displaymessage;

import com.example.displaymessage.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessage extends Activity {

	private TextView mShowTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
				
		String fText = getIntent().getStringExtra(Constants.STRING_KEY);
		showText(fText);		
	}
	
	private void showText(String s){
		mShowTextView = (TextView) findViewById(R.id.showMessage);
		mShowTextView.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

}
