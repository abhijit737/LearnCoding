import java.util.Scanner;
	
class FibbonachiSeriesAdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		
		System.out.println("Fibbonachi series started  ");
	
		
		
		int first =0;
		int second = 1;
		int count=0;
		int next =0;
		for(int i=1; i<=num;i++)
		{
			System.out.println(next);
			next = first + second;
			second =first;
			first =next;
			count+=next;
		
		}
		count -=num;
		System.out.println("addition of all terms is "+count);
	
	
	}



}