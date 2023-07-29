import java.util.Scanner;

public class CWH_prcttc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics:");
        int p =sc.nextInt();
        System.out.println("Enter marks of Maths:");
        int m = sc.nextInt();
        System.out.println("Enter marks of English:");
        int e = sc.nextInt();
        // System.out.println("Enter marks of Chemistry:");
        // int c =sc.nextInt();
        // System.out.println("Enter marks of Sst:");
        // int s = sc.nextInt();
        int percentage = ((p+m+e)*100/300);
        System.out.println("The percentage is:"+percentage);


    }

    
}
