class Person
{
	private String name; // data hiding
	private int age; //data hiding


		public Person(String name, int age)
		{
			this.name = name;
			this.age = age;
		
		
		
		}

		public void setName(String name)
		{
			this.name = name;
		
		}
		
		public void setAge(int age)
		{
			this.age = age;
		
		
		}
		
		
		public String getName()
		{
			return name;
		
		
		}
		
		public int getAge()
		{
			return age;
		
		}

}
class Encapsulation2
{		
		public static void main(String args[])
		{
			Person ec = new Person("Abhijit", 23);
			ec.setName("abhi");
			ec.setAge(19);
	//		System.out.println(ec.name);  // error: name has private access in Person
                        
	//		System.out.println(ec.age);   // error: age has private access in Person
			System.out.println(ec.getName());
			System.out.println(ec.getAge());
		
		}
}


