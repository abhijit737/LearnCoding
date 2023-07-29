import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizze of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n-1];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("enter the index where the value is to be inserted");
        m = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i<m){
                b[i]  =a[i];
            }
            else if(i==m){
                continue;
            }
            else{
                b[i-1] = a[i];
            }

        }
        System.out.println("The new elements of the array are");
        for(int i=0;i<n-1;i++){
            System.out.println( " " + b[i]);
        }
    }
    
}
