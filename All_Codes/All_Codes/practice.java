

import java.util.Scanner;
class practice{
    public static void main(String args[]){
        int num;
        int rev = 0,rem,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        temp =  num;

        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;

        }
        if(rev == num){
            System.out.println("The number is Palindrome.");
        }
        else{
            System.out.println("The number is not Palindrome.");
        }
    }
    
}