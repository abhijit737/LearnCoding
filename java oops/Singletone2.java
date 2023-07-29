
/*

In Java, a Singleton class is typically implemented by creating a private constructor to prevent direct instantiation of the class from outside the class, and a static method that provides access to a single instance of the class. The instance is usually created lazily, i.e., when the first request for the instance is made. The Singleton class is also usually made thread-safe to ensure that the instance is only created once, even in a multi-threaded environment.

*/




class Singletone2
{
	private static Singletone2 instance;
	
	
	private Singletone2()
	{
	
	
	}
	
	public static Singletone2 getInstance()
	
	{
	
		if(instance == null)
		{
			instance = new Singletone2();
			
		}
		
		return instance;
	
	
	
	}
	
	public static void main(String args[])
	{
		Singletone2 obj3  = Singletone2.getInstance();
		Singletone2 obj4  = Singletone2.getInstance();
		
		
		System.out.println(" obj3 == obj4 "+(obj3 == obj4));
	
	}

}