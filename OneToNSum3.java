import java.util.Scanner;

class OneToNSum3
{
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		System.out.println("Sum upto n numbers");
		int i=1;
		int sum = 0;
		while(i<num)
		{
	
			sum+=i;

			i++;  	
		} 	

		System.out.println(sum);
		
	}
}


