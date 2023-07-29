// unchecked

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "iamrakeshsharma9@gmail.com";
        String str2 = "moc.leugam@9amrahshekarsi";
        
        // Remove all non-alphabetic characters and convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Sort the strings and compare them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        
        // Output the result
        if (isAnagram) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }
}


