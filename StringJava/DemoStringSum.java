
import java.util.Scanner; 

class DemoStringSum 
{
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int size= str.length();
		int sum=0;
		for(int i=0;i<size;i++)
		{
			char val=str.charAt(i);
			sum+=(int)val;
		}
		System.out.print(sum);
		
	
	}



}

