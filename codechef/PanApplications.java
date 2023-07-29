import java.util.Scanner;

public class PanApplications 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) 
		{
			long n = sc.nextLong();
			long officers = 20;
			long minUnprocessed = n % officers;
			if (minUnprocessed != 0) 
			{

				minUnprocessed = officers - minUnprocessed;
			}
			System.out.println(minUnprocessed);
		}
		sc.close();
	}
}