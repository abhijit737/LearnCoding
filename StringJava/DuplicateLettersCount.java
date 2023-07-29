// How do you find duplicate characters in a given string

import java.util.Scanner;

class DuplicateLettersCount
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String letter = sc.next();
		int count=0;
		char let[] = letter.toCharArray();
		

		for(int i=0;i<letter.length();i++)
		{
			for(int j=i+1;j<letter.length();j++)
			{
				if(let[i]==let[j])
				{
					count++;
				System.out.println(let[i]);
				}
			
			}
			
		}
		System.out.println(count);

	}

}



