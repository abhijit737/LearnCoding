import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENter values");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The values are");
        for(int i=0;i<n;i++){
            System.out.print(" " +a[i]);

        }


        
    }
    
}



