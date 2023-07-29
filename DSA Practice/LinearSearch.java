
import java.util.Arrays;


class LinearSearch
{

	
	public static int search(int arr[], int x)
	{
		int len =arr.length;
		for(int i=0; i<len; i++)
		{
			if(arr[i] ==x)
			{
				return i;
			}
		
			
			
			
		
		}

		return -1;

	
	}
	
	
	

	public static void main(String args[])
	{
		int arr [] = {1,2,3,4,5,6,7,8,9};
	
		int num = 16;
			
		int index = search(arr,num);
		
		if(index ==-1)
		{
			System.out.println(num+" not found");
		
		}
		else
		{
			System.out.println(num+" found at index "+index);
		
		}
	}
	

}



