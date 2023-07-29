import java.util.*;

class LinearSearchUser
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter elements");
		
		for(int i=0;i<=size-1;i++)
		{
			arr[i] = sc.nextInt(); 
			
		}
		System.out.println("Enter number to find");
		int num=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("got it");

			}
			

		}
		


	}




}