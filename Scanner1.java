import java.util.*;

class Scanner1
{
	public static void main(String args[])
	{
		int a;
		float b;
		Scanner ab = new Scanner(System.in);
		System.out.println("enter an int");
		a = ab.nextInt();
		System.out.println("enter a float");
		b = ab.nextFloat();
		System.out.println("a ="+a);
		System.out.println("b = "+b);
		
	}
}