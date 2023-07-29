class StringPallendrome2
{
	public static void main(String args[])
	{
		String name = "level";
		int len = name.length();
		String rev="";
		for(int i=len-1; i>=0; i--)
		{
			rev+=name.charAt(i);	
		}
		if(name.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("It is pallendrome");
		}
		else
		{
			System.out.println("not pallendrome");
		}

	}

}