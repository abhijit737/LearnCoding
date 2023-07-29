import java.util.Scanner;


class PerfectNum7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum=1;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"is perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}
	}
}		