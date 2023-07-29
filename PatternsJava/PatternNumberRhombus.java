class PatternNumberRhombus
{
	public static void main(String args[])
	{ int count=0;
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				
				System.out.print(" ");
			
			
			}
			for(int k=1; k<=i;k++)
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		
		
		}
		for(int i=1;i<=4; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
					count++;
				System.out.print(count+" ");
			}
			System.out.println();
				
			
			
		}
	
	
	
	}



}



/*

    1
   2 3
  4 5 6
 7 8 9 10
 11 12 13 14
  15 16 17
   18 19
    20


*/