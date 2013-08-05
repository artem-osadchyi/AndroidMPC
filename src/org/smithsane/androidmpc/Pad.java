package org.smithsane.androidmpc;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Pad implements OnTouchListener {
	private final int id;
	
	private Player player = null;
	
	public Pad(View view, Player player, int id) {
		view.setOnTouchListener(this);
		
		this.id = id;
		this.player = player;
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			player.play(id);
		}
		
		return false;
	}
}