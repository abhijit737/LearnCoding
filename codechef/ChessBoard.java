
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChessBoard
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		  int n=sc.nextInt();
		     if(n<=2)
      {
          System.out.println(0);
      }
      else
      {
          if(n%2==1)
          {
              System.out.println((3*(n/2))-1);
              
          }
          else
          {
              System.out.println((3*(n/2))-3);
          }
      }
		}
	}
}
