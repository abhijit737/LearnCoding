
import java.util.Scanner;
import java.lang.*;	
public class StringSubstract {
    public static void main(String[] args) {
        // create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter some input
        System.out.print("Enter second num ");
		double second = sc.nextDouble();

		System.out.print("Enter third num ");
		double third = sc.nextDouble();

		System.out.print("Enter position ");
		int position = sc.nextInt();


		double num =  third/second;
		
		double next =  second/num;
	
		double result = next*Math.pow(num,position-1);


		System.out.print("result is "+(int)result);


    }
}
