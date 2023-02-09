//interface inheritance

interface A
{
	void dispA();
}
interface B extends A
{
	void dispB();
}
class c implements  B
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
class interface3
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
//interface A
//interface B
//class c