// multiple inheritance in interface


interface A
{
	void dispA();
}
interface B
{
	void dispB();
}
class c implements A , B
{
	public void dispA()
	{
		System.out.println("interface A");
	}
	public void dispB()
	{
		System.out.println("interface B");
	}
	void dispc()
	{
		System.out.println("class c");
	}
}
class interface2
{
	public static void main(String args[])
	{
		c c1 = new c();
		c1.dispA();
		c1.dispB();
		c1.dispc();
	}
}


//o.p.
//interfaceA
//interfaceB
//class c