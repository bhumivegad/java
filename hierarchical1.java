//hierarchical  inheritance

class A
{
	void dispA()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void dispB()
	{
		System.out.println("class B");
	}
}
class c extends A
{
	void dispC()
	{
		System.out.println("class C");
	}
}
class hierarchical1
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.dispA();
		b1.dispB();
		//b1.dispC();
		
        c c1 = new c();
		  c1.dispA();
		  //c1.dispB();
		  //c1.dispc();
	}
}

//o.p.
//class A
//class B
//class A