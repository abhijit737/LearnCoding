import java.util.Scanner;
import java.util.Arrays;



class StringAnagram
{
		public static boolean isAnagram(String str1, String str2)
		{
			if(str1.length() != str2.length())
			{
				return false;
			
			}	
		
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		
			return Arrays.equals(arr1,arr2);
		
		}
	
	
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first string :");
			String str1 = sc.next();
			System.out.println("Enter Second String :");
			String str2 = sc.next();
		
			if(isAnagram(str1,str2))
			{
				System.out.println("it is anagram");
				
			
			}
			else
			{
				System.out.println("not anagram");
			
			}
			
	}
	
	
}


/*
 "listen." By rearranging its letters, we can create the word "silent," which is an anagram of "listen." Both words contain the same letters (l, i, s, t, e, and n), but in a different order.
*/