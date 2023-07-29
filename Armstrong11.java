import java.util.Scanner;

class Armstrong11
{

	public static void main(String args[])
	{
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	 int num = sc.nextInt();
    	 int result = 0; 
	int dup = num;	
	while(num > 0)
	{
		int digit = num%10; //
		result = (digit*digit*digit)+result;
		num=num/10;

	}
	if(result == dup)
	{
		System.out.println("it is armstrong");	
	}
	else	
	System.out.println("not armstrong");	
	}	
	
}