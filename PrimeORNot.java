import java.util.Scanner;

class PrimeORNot

{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int count =0;
		for(int i=1; i<=Number; i++)
		{
			if(Number%i ==0)
			{
				count++;
			}
		
		}
		if (Number ==0)

		{
			System.out.println("0 is not prime not Composite");

		}
		else if(count>2)
		{
			System.out.println("number is composite");
	
		}
		else
		System.out.println("Number is Prime");

	}

}