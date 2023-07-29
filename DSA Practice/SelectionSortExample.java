
import java.util.*; 
class SelectionSortExample
{
	public static void selectionSort(int [] arr)
	{
		for(int =0;i<arr.length;i++)
		{
			int index =i;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					
					index =j;	
				}

			}

			int smallerNumber = arr[index];
			arr[index] = smallerNumber;

		}
			

	}
	


	public static void main(String args[])	
	{
		int arr1= {10,43,23,76,87,43,12,43,6}
		SYstem.out.println("Before selection sort");
		for(int i:arr1)
		{
			System.out.println(i+" ");

		}

		System.out.println();

		selectionSort(arr1);
		System.out.println("After selection sort");
		
		for(int i:arr1)
		{
			
			System.out.println(i+" "); 
		}		
	
	}

}

