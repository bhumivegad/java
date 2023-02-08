//super keyword
//constinheritance
class  A
{
	A(int a)
	{
		System.out.println("class A \n ="+a);
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("class B");
		
	}
}
class constinherit1
{
	public static void main(String args[])
	{
		B b1 = new B();
	}
}

//o.p.
//class A
// =10
//class B