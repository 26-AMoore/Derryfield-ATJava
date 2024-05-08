package sound;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * SoundClip
 */

public class SoundClip {
	private String filePath;
	private File audioFile;
	private AudioInputStream audioIn;
	private Clip clip;
	private boolean loop;
	private boolean stop;

	public SoundClip(String path) {
		filePath = path;
		clip = null;
	}

	public void open() {
		try {
			audioFile = new File(filePath);
			audioIn = AudioSystem.getAudioInputStream(audioFile.getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioIn);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

	public void play() {
		if (clip != null) {
			if (clip.isRunning()) {
				clip.stop();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
			clip.setFramePosition(0);
			clip.start();
		}
		if (loop) {
			clip.loop(clip.LOOP_CONTINUOUSLY);
		}
	}

	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	public boolean getLoop() {
		return loop;
	}

	public void play(boolean wait) {
		play();
		if (clip != null && wait) {
			long msec = clip.getMicrosecondLength();
			try {
				Thread.sleep(msec);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public void stop() {
		stop = true;
	}

	public void start() {
		stop = false;
	}


	public void close() {
		if (clip != null) {
			clip.stop();
			clip.close();
		}
	}
}
