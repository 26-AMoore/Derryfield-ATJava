import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class NeverGonnaGive {
	public static void main(String[] args) {
		ToneGenerator tg = new ToneGenerator();
		try {
			tg.init();
		} catch (Exception e) {
			System.err.println("D:");
		}

		int q = 470;
		int h = 940;
		int e = 245;
		int m = 470 * 4;

		tg.play(Note.E4, e);
		tg.play(Note.F4$, e);
		tg.play(Note.G4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.G4, e);
		tg.play(Note.A4, e);
		tg.play(Note.F4$, e);
		tg.play(Note.E4, e);
		tg.play(Note.D4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.D4, h);
		tg.play(Note.REST, h);
		tg.play(Note.E4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.E4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.E4, e);
		tg.play(Note.F4$, e);
		tg.play(Note.G4, e);
		tg.play(Note.E4, q);
		tg.play(Note.D4, q);
		tg.play(Note.D5, e);
		tg.play(Note.REST, e);
		tg.play(Note.D5, e);
		tg.play(Note.A4, q);
		tg.play(Note.REST, q);
		tg.play(Note.E4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.E4, e);
		tg.play(Note.F4$, e);
		tg.play(Note.G4, e);
		tg.play(Note.E4, e);
		tg.play(Note.G4, e);
		tg.play(Note.A4, e);
		tg.play(Note.REST, e);
		tg.play(Note.REST, e);
		tg.play(Note.F4$, e);
		tg.play(Note.E4, e);
		tg.play(Note.D4, e+q);
		tg.play(Note.REST, q);
		tg.play(Note.E4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.E4, e);
		tg.play(Note.F4$, e);
		tg.play(Note.G4, e);
		tg.play(Note.E4, e);
		tg.play(Note.D4, q);
		tg.play(Note.A4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.A4, e);
		tg.play(Note.REST, 1);
		tg.play(Note.B4, e);
		tg.play(Note.A4, h);
	}
}
