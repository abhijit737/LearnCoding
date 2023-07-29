import java.util.Scanner;
import java.util.Arrays;

class ArrayDeleteEmement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr1 [] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		
		}
		int arr2[] = new int[size-1];
		int j=1;
		for(int i=0,k=0; i<arr1.length; i++) 
		{
			if(i!=j)
			{
				arr2[k]=arr1[i];
				k++;
			}
		}
		System.out.println("Before deletion "+Arrays.toString(arr1));
		System.out.println("After deletion "+Arrays.toString(arr2));
	}
}

/*

Enter array size
3
Enter array elements
1
2
3
Before deletion [1, 2, 3]
After deletion [1, 3]

*/