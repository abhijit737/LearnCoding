import java.util.Scanner;


class SmallArrayElement
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];	
	System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();		

		}
		System.out.println("Entered array elements are ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);		

		}
		
		int min=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min)
			{
			
				min = arr[i];
			}
		}
		System.out.println("Smallest element is"+min);

		
	}

}