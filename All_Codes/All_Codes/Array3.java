import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int n,m,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int a[]  = new int [n];
        int b[]=new int[n+1];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("The value of array is ");
        for(int i=0;i<n;i++){

        System.out.print(" " + a[i]);

    }
    
    System.out.println("Enter the index where element in array is to be inserted");
    m = sc.nextInt();
    System.out.println("Enter the value to be insterted");
    p=sc.nextInt();
    for(int i=0;i<n+1;i++){
        if(i<m){
            b[i]=a[i];
        }
        else if(i==m){
            b[i] = p;
        }
        else{
            b[i] = a[i-1];
        }
    }
    System.out.println("Elements are");
    for(int i=0;i<n+1;i++){
        System.out.print(" "+b[i]);
    }
    


}
    
}
