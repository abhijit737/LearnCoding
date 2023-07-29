import java.util.Scanner;


class FactorialUptoN
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int fact = fact(num);
	
		System.out.println(fact);
	}
		public static int fact(int i)
		{
			if (i ==0 )
			{
				return 1;
			}
			
			else
				
			{
				return i * fact(i-1);
			}
		}
	
}