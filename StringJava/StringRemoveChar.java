import java.util.Scanner;


class StringRemoveChar
{
	
	
	public static void main(String args[])
	{
	   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to remove: ");
        char charToRemove = scanner.nextLine().charAt(0);
        String newString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != charToRemove) {
                newString += inputString.charAt(i);
            }
        }
        System.out.println("New string: " + newString);
    }
	

}