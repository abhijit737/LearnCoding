class Person 
{

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;

	}

}

public class Encapsulation
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("abm", 22);
		p1.setName("abhi");
		p1.setAge(23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
