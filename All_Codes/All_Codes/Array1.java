import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the array");
        n = sc.nextInt();

        int a[] = new int[n];
        for(i =0;i<n;i++){
            a[i] = sc.nextInt();

        }
        System.out.println("Print Array");
        for(i =0;i<n;i++){
            System.out.print(" " + a[i]);
        }
        
    }
    
}
