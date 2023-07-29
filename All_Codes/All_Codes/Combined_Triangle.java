import java.util.Scanner;

public class Combined_Triangle {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the num:");
        num = sc.nextInt();
        sc.close();
        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
