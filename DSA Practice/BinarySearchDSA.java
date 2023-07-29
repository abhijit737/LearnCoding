class BinarySearchDSA
{
	public static int binarySearch(int []arr,int beg,int end,int val)
	{

		if(end>=beg)
		{
			int mid = (beg+end)/2;
			if(arr[mid] == val)
			{
				return mid+1;
			}
			
			else if(arr[mid]<val)
			{
				return binarySearch(arr,mid+1,end,val);

			}
				
			else
			{
				return binarySearch(arr,beg,mid-1,val);

			}


		}

		return -1;

	}




	public static void main(String args[])
	{
		int [] arr = {1,2,3,4,5,6,7,8};
		int end = arr.length;
		int val = 7;
		int res = binarySearch(arr,0,end-1,val);
		
		if(res == -1)
		{
			System.out.println("Element not found");	
		}
		
		else
		{
			System.out.println("Element found at "+res+" position");
				
		}

	}

}