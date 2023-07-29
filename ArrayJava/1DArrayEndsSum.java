

// not checked



import java.util.Scanner;

public class 1DArrayEndsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum = arr[0] + arr[n-1]; // add the first and last elements to the sum
        System.out.println("The sum of the first and last elements is: " + sum);
        
    }
}




