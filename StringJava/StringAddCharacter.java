import java.util.Scanner;



class StringAddCharacter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = sc.nextLine();
		
		System.out.println("Enter Character");
		
		char ch = sc.nextLine().charAt(0);
		
		String newStr = ch+str;
		
		System.out.println(newStr);
	
	
	}
	
	


}