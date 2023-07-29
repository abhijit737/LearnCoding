class OverLoadingExample
{
	public static void name(int a)
	{

		System.out.println("void method "+a+" called");

	}

	public String name(String n)
	{
		return n;
	


	}

	public static void main(String args [])
	{


		OverLoadingExample ol = new OverLoadingExample();
		ol.name(5);
		OverLoadingExample ol2 = new OverLoadingExample();
		String named = ol2.name("abhi");
		System.out.println(named);
	}

}