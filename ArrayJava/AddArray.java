import java.util.Arrays;
public class AddArray
{
public static void main(String args[])
{
	int	arr1[] = {1,2,3,4,5};
	int	arr2[]  = {9,8,7,6,5};
	int	arr3[] = new int[arr1.length];
	
	
	for(int i=0;i<arr1.length;i++)
	{
		
			arr3[i]=arr1[i]+arr2[i];
		
		
	
	
	}
	
	for(int i=0; i<arr3.length;i++)
	{
		//System.out.print(arr3[i]+" ");
		

	}
		System.out.print(Arrays.toString(arr3));



}

}