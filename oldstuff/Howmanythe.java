import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import javax.swing.text.TabExpander;

public class Howmanythe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final String TARGET_PHRASE = "the";
        String word;
        int thes = 0;
        
        System.out.println("What string? ");
        while (in.hasNext()){
            word = in.next();
            
            if (word.equals(TARGET_PHRASE) || word.equals("The")){
                thes++;
            } else if (word.equals("q")){
                break;
            }
        }
        System.out.println("you have "+thes+" the's in that sentance");

    }
}
