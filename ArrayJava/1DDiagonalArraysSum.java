// check it

import java.util.Scanner;
import java.util.Arrays;


class 1DDiagonalArraysSum
{
	public static void main(String args[])
	{
		int arr[][] = new {1,23,4,5};
		int arr1[] []=new{};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<=i;j++)
			{
				if (arr[i]==arr[j])
				{
					arr1[i] = arr[i]*arr[j];
				
				}
			
			}
			
		
		
		}
		System.out.println(arr1[i]);
	
	
	}



}