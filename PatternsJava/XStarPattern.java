
public class XStarPattern 
{
    public static void main(String[] args) 
    {
        int size = 5; // Adjust the size of the pattern as needed

        for (int i = 1; i <= size; i++) 
	{
            for (int j = 1; j <= size; j++) 
		{
                	if (i == j || i == (size - j + 1)) 
			{
                    		System.out.print("*");
                	} 
			else 
			{
                 	   	System.out.print(" ");
                	}
            	}
            System.out.println();
        }
    }
}


/*


*   *
 * *
  *
 * *
*   *

*/