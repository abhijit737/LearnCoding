import java.util.Scanner;

class MulTable
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The table is as follows");
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
	}
}	

