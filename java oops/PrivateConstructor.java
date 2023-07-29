class PrivateConstructor
{
	int a; double b; String c;
	private PrivateConstructor()
	{
		int a=10; b=30.56; c = "abhi"; 
		System.out.println("private construcor called");
		System.out.println(a+" "b+" "+c); 
	}
	

	// constructor kept private	
	public static void main(String args[])
	{
	 PrivateConstructor a = new PrivateConstructor();


	}

	// object created within that class only not outside class within other class


}