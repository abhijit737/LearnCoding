class Factorial
{

/*

	public static void main(String args[])
  {

      // using iteration

	int n=5;
	int fact = 1;

	for(int i=1; i<=n; i++)
	{
		fact= fact*i;
							
		System.out.println(fact);
	}

   }


*/

    // using recursion
	
public static void main(String args[])
{
	int n=5;
	int result = fact(n);

	System.out.println(result);
}



	static int fact(int n)
	{
		if(n ==1 || n ==0)
		{
			return 1;
		}
		else					
			return n*fact(n-1);


	}
   
  
	
 
}