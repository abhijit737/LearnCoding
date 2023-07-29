import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        sc.close();
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                temp=temp+1;
            }
            
        }
        if(temp>0){
            System.out.println("The number is not a Prime number.");
        }
        else{
            System.out.println("The number is prime.");
        }
    }
    
}
