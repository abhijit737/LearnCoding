import java.util.Scanner;


class SubTwoArr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		int arr3[] = new int[size];
		for(int i =0; i<size; i++)
		{
			arr1[i] = sc.nextInt();	
		}
		for(int j =0; j<size; j++)
		{
			arr2[j] = sc.nextInt();	
		}

		System.out.println("**************************************");
		for(int i =0; i<size; i++)
		{
				System.out.println(arr1[i]);	
		}
		System.out.println("**************************************");
		for(int j =0; j<size; j++)
		{
			System.out.println(arr2[j]);	
		}
		System.out.println("***********Sub Two arrays***************************");

		for(int k=0; k<size; k++)
		{
			arr3[k] = arr1[k]-arr2[k];	

		}
		for(int k=0; k<size; k++)
		{
			System.out.println(arr3[k]);	

		}

	}


}