import java.util.Scanner;


class BubbleSortExample2
{
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1; j<(n-i); j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];

					arr[j-1] = arr[j];
					arr[j] = temp;
						
				}
				
			}
				

		}


 

	} 
	
	public static void main(String args[])
	{  
		int arr[] = {5,3,2,34,5,6,43,4,5,3,545}
		System.out.println("Array before Bubble Sort");
		for(int i=0;i<arr.lngth;i++)
		{
			System.out.println(i+" ");

		}
		System.out.println();

		bubbleSort(arr);

		System.out.println("Array after bubblesort");
		
		for(int i=0;i<arr.length;i++)
		{

			System.out.println(i+" ");
		}
	}

}