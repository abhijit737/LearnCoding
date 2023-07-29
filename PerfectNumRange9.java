
// no working


import 	java.util.Scanner;

class PerfectNumRange9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();

		int sum=1;

		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;	
					
			}					
			
		}
		if(sum==num)
		{

			System.out.println(num+" is perfect number");	
			
		}
	}
}




