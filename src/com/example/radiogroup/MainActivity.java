package com.example.radiogroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	RadioGroup gr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gr = (RadioGroup) findViewById(R.id.radio);
        gr.setOnCheckedChangeListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.nan:
			Toast.makeText(getApplicationContext(), "ÄÐ", Toast.LENGTH_LONG).show();
			break;
		case R.id.nv:
			Toast.makeText(getApplicationContext(), "Å®", Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}
		
	}


	
    
}
