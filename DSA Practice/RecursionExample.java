class RecursionExample
{

	public static int Rec(int i)
	{
		if(i ==0)
			{
				return 1;
			}
		else
		{
		
			return i*Rec(i-1);
		
				
		}
	
	}


	public static void main(String args[])
	{
		
		int number = 5;
        int result = Rec(number);
        System.out.println("The factorial of " + number + " is " + result);	
	
	}

}



