//single inheritance

class E
{
	void dispE()
	{
		System.out.println("class E");
	}
}

class F extends class E
{
	void dispF()
	{
		System.out.println("class F");
	}
}

class inheritance1
{
	public static void main(String args[])
	{
		E a1;
		F b1;
		
		a1 = new E();
		a1.dispA();
		//a1.dispB();
		
		a1 = new F();
		a1.dispA();
		//a1.dispB();
		
		/*b1 = new A();
		  b1.dispA();
		  b1.dispB();*/
		  
		  b1 = new F();
		  b1.dispA();
		  b1.dispB();
	}
}