class A
{

	int a; String b;
	A()
	{
		a=10; b ="LearnCoding";
		System.out.println(a+" "+b);	
	}

	A(A ref)
	{
		a=ref.a;
		b = ref.b;	
		System.out.println(a+" "+b);	
	}
}

class CopyConstructor
{ 
// refence of object created is paased to another object as paramaeter.
	A  r = new A();
	A r2 = new A(r); 

}

// object value passed to another object parameter so it called copy constructor. 
