//hybrid inheritance

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
class c extends B
{
	void dispC()
	{
		System.out.println("class C");
	}
}
class D extends B
{
	void dispD()
	{
		System.out.println("class D");
	}
}
class hybrid
{
	public static void main(String args[])
	{
		c c1 = new c();
		c1.dispA();
		c1.dispB();
		c1.dispC();
		
        D d1 = new D();
		  d1.dispA();
		  d1.dispB();
		  //d1.dispc();
		  d1.dispD();
	}
}

//o.p.
//class A
//class B
//class c
//class A
//class B
//class D