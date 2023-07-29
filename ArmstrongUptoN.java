import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

import java.lang.Math;

class ArmstrongUptoN

{
	Scanner sc = new Scanner(System.in);
	
		
	
	int number = sc.nextInt();
	
	int num_len = String.valueOf(number).length();
	
	int sum = 0;
	
	int temp = number;
	
	while(number!=0)
	{
	
		int digit = digit%10;
		sum+= Math.pow(digit,num_len);
		temp = temp/10;
		
		
	}
	if(sum == num)
	{
		System.out.print("Armstrong number");
		
	
	}
	else
	{
		System.out.print("not");
	
	}

}