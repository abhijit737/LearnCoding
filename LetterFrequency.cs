using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class LetterFrequency
	{
	
		public static void Main(String[] args)
		{
		  
			string name = "Abhijit";
				
			char [] word = name.ToCharArray();
				
			Dictionary <char, int> dir = new Dictionary<char,int>();
			
			
			foreach( char ch in word)
			{
			
				if(dir.ContainsKey(ch))
				{
				   dir[ch]++;

				}
				
				else
				{
				dir[ch] =1;
				}
			}
			
			
			foreach (var n in dir)
			{
				Console.WriteLine($"char{n.Key} has frequency {n.Value}");
			
			}
		
		}

	}
}
