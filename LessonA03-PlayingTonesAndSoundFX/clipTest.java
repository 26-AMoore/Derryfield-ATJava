import sound.SoundClip;
public class clipTest {
	public static void main(String[] args) {
		SoundClip boing = new SoundClip("Audio/boing.wav");
		SoundClip boing2 = new SoundClip("Audio/boing.wav");
		boing2.open();
		boing2.play();
		boing.open();
		boing.play();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		boing.close();
		boing2.close();
	}
}
