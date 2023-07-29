import java.util.Scanner;

class SecondBigArr
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
			arr[i] =sc.nextInt();
		}

		//sorting
		int temp;		
		for(int i=0; i<size;i++)
		{
			for(int j = i+1; j<size;j++)
			{
				if(arr[i] < arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
			
				}
			
			}	
		}
		
		System.out.println("Second largest element is ");
		System.out.println(arr[1]);		

	}

}


// this sorting based on descending order,if asc then use arr[i] > arr[j];
// 10,12,45,32,54
// 54,45,32,12,10