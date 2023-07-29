import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int n;
        int sum=0;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i= 0; i < n; i++) {
            System.out.print(" " + a[i]);


        }
        for(int i=0;i<n;i++ ){
        sum+=a[i];

    }
    System.out.print("\n"+sum);

}
}
