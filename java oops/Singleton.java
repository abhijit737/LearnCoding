/*

Singleton class is typically implemented by creating a private constructor to prevent direct instantiation of the class from outside the class, and a static method that provides access to a single instance of the class. The instance is usually created lazily, i.e., when the first request for the instance is made. The Singleton class is also usually made thread-safe to ensure that the instance is only created once, even in a multi-threaded environment.
*/



class Singleton
{

	private static Singleton instance;
	
	
	// private cnstructor to avoid outer instantiate
	
	private Singleton()
	{
	
	
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
			
		}
		return instance;
	
	
	
	}
	
	public void doSomething()
	{
		System.out.println("Doing Something.... ");
		
	
	}
	
	public static void main(String args[])
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
	
		System.out.println("obj1 == obj2"+ (obj1 == obj2));
	
		obj1.doSomething();
	
	}
	
}