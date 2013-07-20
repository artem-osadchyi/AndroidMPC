package org.smithsane.androidmpc;

import android.os.Bundle;
import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener, OnLoadCompleteListener {
	private SoundPool soundPool = null;
	
	private int sidKick;
	private int sidSnare;
	private int sidHat;
	private int sidCrash;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((Button) findViewById(R.id.pad1)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad2)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad3)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad4)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad5)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad6)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad7)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad8)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad9)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad10)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad11)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad12)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad13)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad14)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad15)).setOnTouchListener(this);
		((Button) findViewById(R.id.pad16)).setOnTouchListener(this);
		
		soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
		soundPool.setOnLoadCompleteListener(this);
		
		sidCrash = soundPool.load(this, R.raw.crash, 1);
		sidHat = soundPool.load(this, R.raw.hat, 1);
		sidKick = soundPool.load(this, R.raw.kick, 1);
		sidSnare = soundPool.load(this, R.raw.snare, 1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View view, MotionEvent event) {
		((TextView)findViewById(R.id.textView1)).setText(view.getTag().toString());
		
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			switch (view.getId()) {
				case R.id.pad1:
					soundPool.play(sidKick, 1.0f, 1.0f, 1, 0, 1.0f);
					break;
				case R.id.pad2:
					soundPool.play(sidSnare, 1.0f, 1.0f, 1, 0, 1.0f);
					break;
				case R.id.pad3:
					soundPool.play(sidHat, 1.0f, 1.0f, 1, 0, 1.0f);
					break;
				case R.id.pad4:
					soundPool.play(sidCrash, 1.0f, 1.0f, 1, 0, 1.0f);
					break;
			}
		}
		
		return false;
	}

	@Override
	public void onLoadComplete(SoundPool soundPool, int sid, int status) {}
}