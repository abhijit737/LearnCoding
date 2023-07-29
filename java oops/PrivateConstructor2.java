class A
{
	int a; double b; String c;
	private A()
	{
		int a=10; b=30.56; c = "abhi"; 
		System.out.println("private construcor called");
		System.out.println(a+" "b+" "+c); 
	}
	

	// constructor kept private	

}


class PrivateConstructor2
{
	public static void main(String args[])
	{
	 A a = new A();


	}

	// object created within that class only not outside class within other class


}