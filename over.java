//overload...

class B
{
	int sum(int a , int b)
	{
		return(a+b);
	}
	int sum(int a , int b , int c)
	{
		return(a+b+c);
	}
}
class over
{
	public static void main(String args[])
	{
		B b1 = new B();
		System.out.println("sum of nos="+b1.sum(10,20));		
		System.out.println("sum of nos="+b1.sum(10,20,30));		
	}
}

//o.p.
//sum of nos=30
//sum of nos=60