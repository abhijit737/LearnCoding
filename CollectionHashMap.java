import java.util.*;



class CollectionHashMap
{
	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap();
		
		// Insertion
		map.put("India",120);
		map.put("US",120);
		
		System.out.println(map);
		map.put("India",200);
		
		if(map.containsKey("US"))
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
		
		
		
		int arr[] = {1,2,3,4,5,6};   
		
		
		//through iterating 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
			
		// direct taking value
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		
		for(Map.Entry< String,Integer > e :map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
	
	
	}
	



}