// 

class OverLoading

{

	public static void method1(String asr,int i)
	{
	
		System.out.println(" method 1 void type called");
	
	}
	
	public static int method1(int a)
	{
	
		System.out.println(" method 1 int type called");
		return 1;	
	}


	public static void main(String args[])
	{
	
		OverLoading ol = new OverLoading();
	//	ol.method1("aaa",1);
		ol.method1(1);
	}


}