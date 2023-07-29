class First
{

	public static void m2()
	{
		System.out.println(" method m2 called");

	}



}

class Second extends First
{
	public static void m3()
	
	{
	
		System.out.println(" method m3 called");

	
	}


}


class MultilevelInheritance extends Second
{

	public static void main(String args[])
	{
		
			MultilevelInheritance ml3 = new MultilevelInheritance();
			ml3.m2();
		
	}


}