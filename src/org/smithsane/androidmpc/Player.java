package org.smithsane.androidmpc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;

public class Player {
	private Context context = null;
	private byte[][] soundBank = null;
	
	private int stream = AudioManager.STREAM_MUSIC;
	private int rate = 44100;
	private int channel = AudioFormat.CHANNEL_OUT_STEREO;
	private int format = AudioFormat.ENCODING_PCM_16BIT;
	private int bufferSize = 4096;
	private int mode = AudioTrack.MODE_STREAM;
	
	private AudioTrack track;
	
	public Player(Context context) {
		this.context = context;
		
		try {
			this.initialize();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void initialize() throws IOException {
		soundBank = new byte[16][];
		
		soundBank[0] = this.load(R.raw.kick1);
		soundBank[1] = this.load(R.raw.snare1);
		soundBank[2] = this.load(R.raw.ophat1);
		soundBank[3] = this.load(R.raw.clhat1);
		soundBank[4] = this.load(R.raw.kick2);
		soundBank[5] = this.load(R.raw.snare2);
		soundBank[6] = this.load(R.raw.ophat2);
		soundBank[7] = this.load(R.raw.clhat2);
		soundBank[8] = this.load(R.raw.perc1);
		soundBank[9] = this.load(R.raw.ride1);
		soundBank[10] = this.load(R.raw.clap1);
		soundBank[11] = this.load(R.raw.crash1);
		soundBank[12] = this.load(R.raw.perc2);
		soundBank[13] = this.load(R.raw.ride2);
		soundBank[14] = this.load(R.raw.clap2);
		soundBank[15] = this.load(R.raw.crash2);
		
		track = new AudioTrack(stream, rate, channel, format, bufferSize, mode);
		track.play();
	}
	
	public void play(int padId) {
		byte[] bytes = soundBank[padId];
		
		track.write(bytes, 0, bytes.length);
	}
	
	public void release() {
		track.stop();
		track.release();
	}
	
	private void copy(InputStream in, OutputStream out) throws IOException {
		int b;
		
		while ((b = in.read()) != -1) {
			out.write(b);
		}
	}
	private byte[] load(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		this.copy(in, out);
		
		return out.toByteArray();
	}
	private byte[] load(int resId) throws IOException {
		byte[] output = null;
		
		InputStream input = context.getResources().openRawResource(resId);
			output = this.load(input);
		input.close();
		
		return output;
	}
}