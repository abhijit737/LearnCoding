class SingleClass
{

	public static void m1()
	{

		System.out.println("M1 method called");

	}
	


}

class SingleInheritance extends SingleClass
{

	public static void main(String args[])
	{
		
	SingleInheritance s2 = new SingleInheritance();
	s2.m1();


	}


}