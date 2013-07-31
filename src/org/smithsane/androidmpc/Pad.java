package org.smithsane.androidmpc;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Pad implements OnTouchListener {
	private SoundPool soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
	
	private int soundId;
	private float leftVolume = 1.0f;
	private float rightVolume = 1.0f;
	private int loop = 0;
	private float rate = 1.0f;
	
	public Pad(View view, Context context, int resId) {
		view.setOnTouchListener(this);
		
		soundId = soundPool.load(context, resId, 1);
	}
	
	public float getLeftVolume() {
		return leftVolume;
	}
	public float getRightVolume() {
		return rightVolume;
	}
	public int getLoop() {
		return loop;
	}
	public float getRate() {
		return rate;
	}
	
	public void setLeftVolume(float leftVolume) {
		this.leftVolume = leftVolume;
	}
	public void setRightVolume(float rightVolume) {
		this.rightVolume = rightVolume;
	}
	public void setLoop(int loop) {
		this.loop = loop;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			soundPool.play(soundId, leftVolume, rightVolume, 1, loop, rate);
		}
		
		return false;
	}
}