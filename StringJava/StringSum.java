import java.util.Scanner;


class StringSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int demo =0;
		int size=name.length()-1;
		for(int i=0;i<=size;i++)
		{
			char ch = name.charAt(i);
			int demo2 = (int)ch;
			demo+=demo2;
		}
		System.out.println(demo);
	
	}



}