import java.util.Scanner;
import java.util.Arrays;



class LinearSearch2
{
	public static void main(String args[])
	{
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
	
		System.out.println("Enter elements");
		int arr[] = new int[size];
		
*/		
		int[]arr = {54,67,3,23,6,98,11};
	

		sort(arr);
	
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
			
			
		}
		

	}
	
	
	public static void sort(int[] arr)
	
	{
		
		int temp;	
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] >	arr[j])
				{
					temp = arr[i];
					arr[i]	= arr[j];
					arr[j]	= temp;
				}
			}
		}
		
		
		

	}





}