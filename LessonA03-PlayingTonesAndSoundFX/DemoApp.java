import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class DemoApp {
	public static void main(String[] args) {
		ToneGenerator tg = new ToneGenerator();
		try {
			tg.init();
		} catch (Exception e) {
			System.err.println("D:");
		}
// vim macro
// jotg.play()�klNote. �kb, �kb 1000�kr;
		tg.play(Note.A3, 1000);
		tg.play(Note.REST, 1000);
	}
}