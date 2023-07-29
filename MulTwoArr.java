import java.util.Scanner;


class Add3DTwoArr
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
		System.out.println(arr3[i][j][k]);	

		for(int i =0; i<size; i++)
			{
				for(int j=0;j<size;j++)
				{
					for(int k=0; k<size; k++)
					{
						
					  arr1[i][j][k] = sc.nextInt();
					}
				}
			}
			
		System.out.println("**************************************");
		
		for(int i =0; i<size; i++)
			{
				for(int j=0;j<size;j++)
				{
					for(int k=0; k<size; k++)
					{
						
						arr2[i][j][k]=sc.nextInt();
					}
				}
			}
			System.out.println("**************************************");
		for(int i =0; i<size; i++)
			{
				for(int j=0;j<size;j++)
				{
					for(int k=0; k<size; k++)
					{
						
						System.out.println(arr1[i][j][k]);	
					}
				}
			}
		
		System.out.println("**************************************");
		for(int i =0; i<size; i++)
			{
				for(int j=0;j<size;j++)
				{
					for(int k=0; k<size; k++)
					{
						
						System.out.println(arr2[i][j][k]);	
					}
				}
			}
		System.out.println("***********Adding Two arrays***************************");

		for(int k=0; k<size; k++)
		{
			for(int i=0; i<size; i++)
			{
				
				for(int j=0; j<size; j++)
					
				{
					arr3[k][i][j] = arr1[k][i][j]+arr2[k][i][j];
			
				}
				
			}
			
		}
		for(int i=0; i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				for(int k=0; k<size; k++)
					
					{
						System.out.println(arr3[i][j][k]);
		
						
					}
				
			}
			System.out.println("");
		
			
		}

	}


}