
import java.util.Scanner;

class DuplicateLetters
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String letter = sc.next();
		char let[] = letter.toCharArray();
		
		for(int i=0;i<letter.length();i++)
		{
			for(int j=i+1;j<letter.length();j++)
			{
				if(let[i]==let[j])
				System.out.print(let[i]);	
			}
		}

	}

}



