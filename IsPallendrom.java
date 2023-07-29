import java.util.Scanner;
class IsPallendrom
{
	
	Scanner sc = new Scanner(System.in);
	public static void main(String Args[])
	{
	
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int digit = num%10;
			sum=(sum*10)+digit;
			num=num/10;		
	
		}

		System.out.println(sum);

	}
}
		





































			


	}


}