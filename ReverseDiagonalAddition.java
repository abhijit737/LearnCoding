
import java.util.Scanner;
import java.util.Arrays;


class ReverseDiagonalAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter columns");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("Enter Elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		

		}
		int sum=0;
		for(int i=0, j=arr.length-1;i< arr.length;i++,j--)
		{
			sum+=arr[i][j];
		
		}
		
		System.out.println("sum is "+sum);
	}


}