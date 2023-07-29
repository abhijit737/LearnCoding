import java.util.Scanner;

//check even or odd
public class ODDEVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is not even.");
        }
    }
    
}
