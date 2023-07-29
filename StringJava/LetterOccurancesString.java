//How do you count the occurrence of a given character in a string?

import java.util.Scanner;



class LetterOccurancesString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String name = sc.next().toLowerCase();
		char [] name2 = name.toCharArray();
		System.out.println("Enter letter to find occurance");
		char letter = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<name2.length;i++)
		{
				if(letter==name2[i])
				{
					count ++;
				
				}
		}
		System.out.println(count);
	
	}



}