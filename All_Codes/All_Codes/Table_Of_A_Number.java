import java.util.Scanner;

public class Table_Of_A_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }

    }
    
}
