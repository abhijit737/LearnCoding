
// not checked



import java.util.Arrays;
import java.util.Scanner;

public class Merge1DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // create the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // create the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        // merge the arrays
        int[] mergedArr = new int[n1 + n2];
        int pos = 0;
        for (int i = 0; i < n1; i++) {
            mergedArr[pos++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArr[pos++] = arr2[i];
        }
        
        // print the merged array
        System.out.println("Merged array: " + Arrays.toString(mergedArr));
        

    }
}
