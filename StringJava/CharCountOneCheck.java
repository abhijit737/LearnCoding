// not solved

import java.util.Scanner;

public class CharCountOneCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char uniqueChar = findFirstUniqueChar(str);
        if (uniqueChar != '\0') {
            System.out.printf("The first unique character in the string '%s' is '%c'.", str, uniqueChar);
        } else {
            System.out.printf("There are no unique characters in the string '%s'.", str);
        }
    }

    public static char findFirstUniqueChar(String str) {
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0';
    }
}



