class StringInPlaceReversed
{
	public static void main(String args[])
	{
		String str = "Hello World";
		char[] chararr = str.toCharArray();
		
		int left=0;
		int right = chararr.length-1;
		
		
		while(left<right)
		{
		// swapping characters at right and left
		
			char temp= chararr[left];
			chararr[left] = chararr[right];
			chararr[right] = temp;
			
			
			// moving left and right characters each other
			
			left++;
			right--;
			
		}
		//converting char array back to string
		
		String revString = new String(chararr);
		
		System.out.println(str);
		System.out.println(chararr);
	
	
	}

}