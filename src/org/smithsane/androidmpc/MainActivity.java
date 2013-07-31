package org.smithsane.androidmpc;

import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Pad pad1 = new Pad(findViewById(R.id.pad1), this, R.raw.kick);
		Pad pad2 = new Pad(findViewById(R.id.pad2), this, R.raw.snare);
		Pad pad3 = new Pad(findViewById(R.id.pad3), this, R.raw.crash);
		Pad pad4 = new Pad(findViewById(R.id.pad4), this, R.raw.hat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}