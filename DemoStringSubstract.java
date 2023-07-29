
import java.util.Scanner;

public class DemoStringSubstract
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
        String ciphertext = sc.next();
        String plaintext = "";

        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Shift the letter 3 positions to the right
                char shifted = (char) (c + 3);

                // If the shifted letter goes beyond 'z', wrap around to 'a'
                if (shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }

                plaintext += shifted;
            } else {
                plaintext += c;
            }
        }

        System.out.println("Plaintext: " + plaintext);
    }
}
