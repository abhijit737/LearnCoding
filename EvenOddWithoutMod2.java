
import java.util.Scanner;

class EvenOddWithoutMod2
{
	public static void main(String args[])
	
	{
	Scanner sc = new Scanner(System.in);
	int num	= sc.nextInt();
	int temp = num;
	int result = (num*2)/4;
	if(temp == result)
	{
		System.out.println("it is even");

	}
	else
	System.out.println("odd");

	}
}
