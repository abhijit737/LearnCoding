import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!!");
        n = sc.nextInt();
        System.out.println("Enter the data");
        // i = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Elements are:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }

        System.out.println("\n The reverse of array is:");
            for(int i=a.length-1;i>=0;i--){
            System.out.print(" " +a[i]);

            }
    
    }
}


