import java.util.Scanner;

class PrimeOrNot4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count =0;
		
			for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{	
	
				count++;
					
			}	
		}				
		if(count>2)
			{
				System.out.println("number is composite");

			}
		else
			{
			System.out.print("prime number");		
	
			}	
			
			
	}



}