import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str;
        String plain;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        plain = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("String after replacement of special character is:\n" +plain);
        

    }
    
}


/*

str rem = abc.removeAll["a-zA-Z0-9",""];