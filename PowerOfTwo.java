import java.util.Scanner;

class PowerOfTwo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" enter number to check wheather it power of two or not: ");
		int num = sc.nextInt();
		int val=(num &(num-1));
		if(val ==0)
	{
			System.out.println("given number is power of two");		
		}
		else
		{
			System.out.println("given number is not power of two");
		}	

	}

}




