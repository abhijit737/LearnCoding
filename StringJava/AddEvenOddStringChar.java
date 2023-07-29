import java.util.Scanner;
class AddEvenOddStringChar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String even ="";
		String odd ="";
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				even += name.charAt(i);
			}
			else
			{
				odd += name.charAt(i);
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}


