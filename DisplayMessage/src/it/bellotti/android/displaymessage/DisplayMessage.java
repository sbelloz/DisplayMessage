package it.bellotti.android.displaymessage;

import com.example.displaymessage.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
				
		String text = getIntent().getStringExtra(Constants.STRING_KEY);
		showText(text);
	}
	
	private void showText(String text){
        TextView textView = (TextView) findViewById(R.id.showMessage);
        textView.setText(text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

}
