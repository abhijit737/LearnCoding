import java.util.Scanner;


class StringAddCharAtPosition
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.println(" Enter a string");
		String str = sc.nextLine();
		
		System.out.println(" Enter a char");
		char ch = sc.nextLine().charAt(0);
		 		 
		System.out.println(" Enter postion");
		int num = sc.nextInt();
	
		
		String newString = str.substring(0,num) + ch + str.substring(num);
		
		System.out.println(newString);
	
	}
		

}
