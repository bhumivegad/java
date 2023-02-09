//interface

interface A
{
	void disp();
}
class B implements A
{
	public void disp()
	{
		System.out.println("interface A");
	}
	void dispB()
	{
		System.out.println("class B");
	}
}
class interface1
{
	public static void main(String args[])
	{
		A a1;
		a1 = new B();
	 // a1.dispB();
	 
	   B b1 = new B();
	   b1.disp();
	   b1.dispB();
	}
}


//o.p.
//interface A
//interface A
//class c