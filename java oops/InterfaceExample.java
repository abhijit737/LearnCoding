interface customerRaj
{
	int amt=5;       // by default public+static+final
	void purchase(); // public + abstract
	
}
class sellerSanju implements customerRaj
{
	public void purchase()
	{
		// int amt =7;

		System.out.println("raj needs "+amt+" kg rice");
	}
	
}

class InterfaceExample
{
	public static void main(String args[])
	{
		customerRaj cr = new sellerSanju();
		cr.purchase();
		System.out.println(customerRaj.amt); 

	}
		
}