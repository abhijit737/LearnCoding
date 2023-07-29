import java.util.Scanner;


class MulTableUptoN6

{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("the tables are as follows");
		for(int i=1; i<=num; i++)
		{
 			for(int j=1; j<=10; j++)
			{		
				System.out.println(i*j);
			}
		System.out.println();
		}
	}
}