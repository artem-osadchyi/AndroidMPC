package org.smithsane.androidmpc;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	private Player player = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		player = new Player(this);
		
		Pad pad0 = new Pad(findViewById(R.id.pad0), player, 0);
		Pad pad1 = new Pad(findViewById(R.id.pad1), player, 1);
		Pad pad2 = new Pad(findViewById(R.id.pad2), player, 2);
		Pad pad3 = new Pad(findViewById(R.id.pad3), player, 3);
		Pad pad4 = new Pad(findViewById(R.id.pad4), player, 4);
		Pad pad5 = new Pad(findViewById(R.id.pad5), player, 5);
		Pad pad6 = new Pad(findViewById(R.id.pad6), player, 6);
		Pad pad7 = new Pad(findViewById(R.id.pad7), player, 7);
		Pad pad8 = new Pad(findViewById(R.id.pad8), player, 8);
		Pad pad9 = new Pad(findViewById(R.id.pad9), player, 9);
		Pad pad10 = new Pad(findViewById(R.id.pad10), player, 10);
		Pad pad11 = new Pad(findViewById(R.id.pad11), player, 11);
		Pad pad12 = new Pad(findViewById(R.id.pad12), player, 12);
		Pad pad13 = new Pad(findViewById(R.id.pad13), player, 13);
		Pad pad14 = new Pad(findViewById(R.id.pad14), player, 14);
		Pad pad15 = new Pad(findViewById(R.id.pad15), player, 15);
	}
}