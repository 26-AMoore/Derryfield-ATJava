package OtherTestsandStuff;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class hashingtest {
    public static void main(String[] args) throws NoSuchAlgorithmException{
        int incriment = 0;
        String test = "";
        byte[] encodedhash;
        MessageDigest digest;
        String target;
        Scanner scan;
        System.out.println("what is your target?");
        scan = new Scanner(System.in);
        target = scan.next();
        digest = MessageDigest.getInstance("SHA-256");
        /* 
        while (incriment <= 999){
            test = String.valueOf(incriment);
            incriment++;
            digest = MessageDigest.getInstance("SHA-256");
            encodedhash = digest.digest(test.getBytes(StandardCharsets.UTF_8));
            //System.out.printf("hash: %s original: %s literal: %d%n",encodedhash,test,incriment);
            if (encodedhash.equals(target)){
                System.out.printf("hash: %s original: %s literal: %d%n",encodedhash,test,incriment);
            } else {
                System.out.println(incriment);
            }
        }
        */
        while (true) {
        encodedhash = digest.digest(test.getBytes(StandardCharsets.UTF_8));
        System.out.println(encodedhash);
        digest = MessageDigest.getInstance("SHA-256");
        encodedhash = digest.digest(test.getBytes(StandardCharsets.UTF_8));
        System.out.println(encodedhash);
        }
    }
}
// 97 -> 122

/*
 * okay so, we need a bunch of random strings. how tf do i do that?
 * i guess start by limiting myself to only 5 charaters
 * so i need aaaaa -> zzzzz
 * start with aaaaa, then just incriment it up
 * like assign each letter a value
 * and base my counting system on that
 * so once aaaaz then aaaza
 * jesus this is gonna take a while, mabye only up to 3 characters
 * yeah that sounds good
 * but how do i make a whole counting system
 * i++
 * if i == "z"{
 * incriment the second place value
 * }
 * actually lets start one less even
 * only numbers
 */