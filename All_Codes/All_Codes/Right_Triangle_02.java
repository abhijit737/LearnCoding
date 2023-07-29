import java.util.Scanner;

public class Right_Triangle_02 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        num = sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            for(int j =1;j<=i;j++){ 
                System.out.print( " ");
                

                
            }
            for(int k=num;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}


/* 
    *****   //output
     ****
      ***
       **
        * 
        */
