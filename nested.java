//nested if

import java.util.*;

class nested
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("positive");
			}
			else
			{
				System.out.println("Negative");
			}
		}	
	    else
			{
				System.out.println("zero");
			}
		
	}
}
