import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0;i<10;i++){
        System.out.println("enter the number:");
        sum = sum+sc.nextInt();

        }
        System.out.println("the sum is"+ +sum);
    
}

}

