import java.util.Scanner;


class Mul3DTwoArr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr1[][] = new int[size][size];
		int arr2[][] = new int[size][size];
		
		int arr3[][] = new int[size][size];
		

		for(int i =0; i<size; i++)
			{
				for(int j=0;j<size;j++)
				{
					for(int k=0; k<size; k++)
					{
						
					  arr1[i][j]= sc.nextInt();
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
						
						arr2[i][j]=sc.nextInt();
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
						
						System.out.println(arr1[i][j]);	
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
						
						System.out.println(arr2[i][j]);	
					}
				}
			}
		System.out.println("***********Multiply Two arrays***************************");

		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				
				for(int k=0; k<size; k++)
					
				{
					arr3[i][j] = arr1[i][j]*arr2[i][j];
			
				}
				
			}
			
		}
		for(int i=0; i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				for(int k=0; k<size; k++)
					
					{
						System.out.print(arr3[i][j]);
		
						
					}
				System.out.print(" ");
			}
			System.out.println("");
		
			
		}

	}


}