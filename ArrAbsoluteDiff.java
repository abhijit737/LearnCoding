
//tech mahindra youtube question


import java.util.Scanner;
import java.lang.Math;

class ArrAbsoluteDiff
{
 public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		int arr[] = new int[size];
		int temp=0;
		int pen=0;
		for(int i=0;i<size-1;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				
				}
				
			}
		
		
		}
				for(int i=0;i<size-1;i++)
				{
					
				pen+=Math.abs(arr[i]-arr[i-1]);
		
				}
		
		System.out.println(pen);
		
	}
}