import java.util.Scanner;

//multiplication table of a number
public class Multiplication_Table_of_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println("The Table is:"+" " +n*i);
        }


    }
    
}
