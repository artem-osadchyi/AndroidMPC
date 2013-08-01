package org.smithsane.androidmpc;

import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Pad pad0 = new Pad(findViewById(R.id.pad0), this, R.raw.kick);
		Pad pad1 = new Pad(findViewById(R.id.pad1), this, R.raw.snare);
		Pad pad2 = new Pad(findViewById(R.id.pad2), this, R.raw.crash);
		Pad pad3 = new Pad(findViewById(R.id.pad3), this, R.raw.ophat);
		Pad pad4 = new Pad(findViewById(R.id.pad4), this, R.raw.boom);
		Pad pad5 = new Pad(findViewById(R.id.pad5), this, R.raw.bass);
		Pad pad6 = new Pad(findViewById(R.id.pad6), this, R.raw.uplift);
		Pad pad7 = new Pad(findViewById(R.id.pad7), this, R.raw.downlift);
		Pad pad8 = new Pad(findViewById(R.id.pad8), this, R.raw.loop);
		Pad pad9 = new Pad(findViewById(R.id.pad9), this, R.raw.synth);
		Pad pad10 = new Pad(findViewById(R.id.pad10), this, R.raw.ride);
		Pad pad11 = new Pad(findViewById(R.id.pad11), this, R.raw.perc);
		Pad pad12 = new Pad(findViewById(R.id.pad12), this, R.raw.lbass);
		Pad pad13 = new Pad(findViewById(R.id.pad13), this, R.raw.clhat);
		Pad pad14 = new Pad(findViewById(R.id.pad14), this, R.raw.clap);
		Pad pad15 = new Pad(findViewById(R.id.pad15), this, R.raw.ophat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}