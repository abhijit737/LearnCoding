import java.util.Scanner;

public class ArrayDiagonalAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Initialize a 2D array with user inputs
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter the element at [%d][%d]: ", i, j);
                arr[i][j] = input.nextInt();
            }
        }

        // Calculate the diagonal sum
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][i];
        }

        // Print the result
        System.out.println("The sum of the diagonal elements is: " + sum);

        input.close();
    }
}
