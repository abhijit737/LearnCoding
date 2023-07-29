import java.util.Scanner;



class Pallendrom10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		int t =num;

		int rev = 0;
	
		while(num!=0)
		{
			rev = rev*10+(num%10);
			num=num/10;
				
	
		}
		if(rev==t)
		{
			System.out.println(t+" is a palindrome number");
		}
		else
		{
			System.out.println(t+" not a palindrome number");
				
		}
	}
}