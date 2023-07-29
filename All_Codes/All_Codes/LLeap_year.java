import java.util.Scanner;

//leap year
public class LLeap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("its not a leap year");
        }
        
    }
    
}
