using System;
using System.Linq;


namespace HelloWorld
{
	public class ArrangeByLength
	{
	
		public static void Main(String[] args)
		{
		  
			String name = "I am a about to kill in my house";
			
			String[] name2 = name.Split(' ');
			
			
			var order = name2.OrderBy(word => word.Length);
			
			 
			 String dummyname = String.Join(" ",order);
			
			
			
			
			  Console.WriteLine(dummyname);
			
			
		  
		}
		}
}
