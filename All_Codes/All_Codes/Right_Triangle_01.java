import java.util.Scanner;

public class Right_Triangle_01 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        num = sc.nextInt();
        sc.close();
        for(int i= 1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");// for space
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");//for *
            }
            System.out.println(" " );
        }
    }
    
}
/*   output
   *
  **
 ***
****


*/
