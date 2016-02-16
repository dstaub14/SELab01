package com.example.guilhermecortes.contactmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by John on 2/16/2016.
 */
public class ShareActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Intent
        Intent intent = getIntent();
        String type = intent.getType();
        String action = intent.getAction();

        //Whether Intent action is ACTION_SEND
        if(Intent.ACTION_SEND.equals(action) && type != null){
            //Whether Intent type is 'text/plain'
            if(type.equals("text/plain")){
                //Get message from Intent
                String message = intent.getStringExtra(Intent.EXTRA_TEXT);
                //Display message
                TextView textView = (TextView) findViewById(R.id.contactName);
                textView.setText(message);
            }
        }
    }
}
