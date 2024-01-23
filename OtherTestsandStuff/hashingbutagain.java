package OtherTestsandStuff;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class hashingbutagain {

    public static void main(String[] args) {
        String input;
        Scanner scan;
        System.out.println("What is your target? ");
        scan = new Scanner(System.in);
        input = scan.nextLine();

        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

            // Convert the input string to bytes using a specific encoding (e.g., UTF-8)
            byte[] inputBytes = input.getBytes("UTF-8");

            // Compute the hash
            byte[] hash = sha256.digest(inputBytes);

            // Convert the hash bytes to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println("SHA-256 Hash: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
