//constinheritance
class  A
{
	A(int a)
	{
		System.out.println("class A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("class B");
		
	}
}
class constinherit
{
	public static void main(String args[])
	{
		B b1 = new B();
	}
}

//o.p.
//class B