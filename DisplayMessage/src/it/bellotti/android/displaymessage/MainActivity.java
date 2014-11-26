package it.bellotti.android.displaymessage;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodInfo;
import android.widget.TextView;
import com.example.displaymessage.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity
        extends Activity
         implements EditText.OnEditorActionListener {

    private EditText mEditMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init views
        mEditMessage = (EditText) findViewById(R.id.message);
        mEditMessage.setOnEditorActionListener(this);
    }

    public void onClick(View view) {
        String string = mEditMessage.getText().toString();
        startDisplayMessage(string);
    }

    private void startDisplayMessage(String s) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(Constants.STRING_KEY, s);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.send_message, menu);
        return true;
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (EditorInfo.IME_ACTION_DONE == actionId) {
            String string = mEditMessage.getText().toString();
            startDisplayMessage(string);
            return true;
        }
        return false;
    }
}


