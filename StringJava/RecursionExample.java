class RecursionExample
{
	


	static void printing()
	{
		 int count = 5;
		
		while(count !=0)
		{
			count--;
			System.out.println("Printing");
			printing();
		}	
	

	}

	public static void main(String args[])
	{
		
		printing();

	}



}