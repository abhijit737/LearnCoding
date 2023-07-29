class CopyConstrucor2
{
	int a; double b; String c;
	
	private CopyConstrucor2()
	{
		a=10; b=40.60; c="akasa";
		System.out.println(a+" "+b+" "+c);	
	
	}

	public static void main(String args[])
	{
		CopyConstrucor2 c = new CopyConstrucor2();

	}

}


// object of class not created in another working class 