public class DiagonalAdditionArray {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Calculate the diagonal sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        // Print the result
        System.out.println("The sum of the diagonal elements is: " + sum);
    }
}