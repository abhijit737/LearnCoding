class MissingNumArr
{
	public static int missing(int[] nums)
	{
		int size = arr.length+1;
		int totalsum = size*(size+1)/2;
		int actualsum=0;
		for(int num :nums)
		{
			int actualsum  += num; 
	
		}

			
		int missingnum = totalsum-actualsum;
		
		return missingnum;
	}
	
	public static void main(String args[])
	{
		int arr[]  ={1,2,4,5};
		int missingnum=missing(nums);
		System.out.println(missingnumber);
	

	}


}