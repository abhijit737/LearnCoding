// not working

import java.util.Scanner;


class StringContainsDigits
{
	Scanner sc = new Scanner(System.in);
	
	String num = sc.next();
	
	boolean containsOnlyDigits = num.matches("[0-9]+");
	
	if(containsOnlyDigits) 
	{
		System.out.println("The string contains only digits.");
	}
	else
	{
    System.out.println("The string contains non-digit characters.");
	}
}
