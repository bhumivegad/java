class B
{
	int sum(int a , int b)
	{
		return(a+b);
	}
	float sum(float a , float b)
	{
		return(a+b);
	}
}
class over2
{
	public static void main(String args[])
	{
		float x=100 ,y=200;
		B b1 = new B();
		System.out.println("sum of  two nos="+b1.sum(10,20));		
		System.out.println("sum of three float nos="+b1.sum(x,y));		
	}
}

//o.p.
//sum of two nos=30
//sum of three float nos=300.0