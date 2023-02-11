//interface

interface A
{
	void dispA();
}
interface B
{
	void dispB();
}
class c
{
	void dispc()
	{
		System.out.println("class c");
	}
}
class D extends c implements A,B //multiole interface
{
	public void dispA()
	{
		System.out.println("interfaceA");
	}
	public void dispB()
	{
		System.out.println("interfaceB");
	}
	void dispD()
	{
		System.out.println("class D");
	}
}
class interface4
{
	public static void main(String args[])
	{
		D d1 = new D();
		d1.dispA();
		d1.dispB();
		d1.dispc();
		d1.dispD();
	}
}

//o.p.
//interfaceA
//interfaceB
//class c
//class D























































