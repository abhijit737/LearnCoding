import java.util.Scanner;

public class StringAddFirstLast{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String newString = Character.toString(inputString.charAt(0)) + Character.toString(inputString.charAt(inputString.length() - 1));
        System.out.println("New string: " + newString);
    }
}
