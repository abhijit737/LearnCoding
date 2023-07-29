import java.util.Scanner;

public class CWH_prcttc_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km:");
        double km = sc.nextDouble();
        double miles = km*0.63;
        System.out.println("The distance in miles is:"+miles);
    }
    
}
