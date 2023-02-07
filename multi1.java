//multi level inheritance

class A    //grand parent
{
	void dispA()
	{
		System.out.println("class A");
	}
}
class B extends A     //parent
{
	void dispB()
	{
		System.out.println("class B");
	}
}
class c extends B   //child
{
	void dispc()
	{
		System.out.println("class C");
	}
}
class multi1
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
//class A
//class B
//class C