// prime number

import java.util.*;
class prime1
{

	public static void main(String args[])
	{
		int n ,i;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		for(i=2 ; i<n ; i++)
		{
			if(n%i==0)
				break;
		}
		if(n==i)
			System.out.println(n + "IS prime");
		else
			System.out.println(n + "IS not prime");
	}
}

// 7 is prime   8 is not prime