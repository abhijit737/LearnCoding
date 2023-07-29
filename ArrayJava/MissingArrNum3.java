class MissingArrNum3
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,5};
		int size = arr.length+1;
		int actualSum = size*(size+1)/2;
		int calcsum=0;		
		for(int num:arr)
		{
			calcsum+=num;
		
		}
		
		int missingnum = actualSum -calcsum;
				
		System.out.println(missingnum);

					


	}




}