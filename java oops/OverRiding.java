class OverRiding
{

		public static void method1(int a)
		{
			System.out.println("method1 in first position is called");
		
		
		}
	
		
		public static void method1(int a, int b)
		{
			System.out.println("method1 in 2nd position is called");
		
		
		}
		
		
		public static void main(String args[])
		{
		
				OverRiding or = new OverRiding();
				// or.method1(2,5);
				or.method1(2);
		
		}

}