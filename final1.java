//final
//multi level inheritance

class A    
{
	void disp()
	{
		System.out.println("class A");
	}
}
class B extends A 
{
	void disp()
	{
		System.out.println("class B");
	}
}
class c extends B   
{
	void disp()
	{
		System.out.println("class C");
	}
}
/* class D extends A
{
  void disp()
  {
	System.out.println("class D");
  }
}*/
class final1
{
	public static void main(String args[])
	{
		 B b1 = new B();
		  b1.disp();
		 c c1 = new c();
		  c1.disp();
	}
}

//o.p.
//class B
//class c