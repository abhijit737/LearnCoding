class OverRiding
{
	public static void name()
	{
		System.out.println(" first method printed");
	}
		
	
	
	
}

class OverRidingExample extends OverRiding
{
	public static void name()
	{
		System.out.println("second method called");	
	}


	public static void main(String args[])
	{

		OverRiding r = new OverRidingExample();


		
		r.name();


		OverRidingExample r2 = new OverRidingExample();
		
		r2.name();
	}

}