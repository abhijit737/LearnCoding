import java.util.Scanner;

class FibbonaciSeries
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to print fibbonachi series");
		int num = sc.nextInt();
		
			int first = 0;
			int second =1;
						
						
		System.out.println("fibbonachi series is");
		for(int i=1;i<=num;i++)
		{
			System.out.println(first) ;
			int next = first + second ;
			first = second ;
			second = next ;
			
		}
		
	}


}

