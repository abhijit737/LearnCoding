import java.util.Scanner;

public class ZeroAndOne {
    public static void main(String[] args) {
        int zero = 0;
        int one = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        // scan.close();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " element in array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            }
        }
        System.out.println("No. of zeroes present in array :" + zero);
        System.out.println("No. of ones present in array :" + one);
    }
}