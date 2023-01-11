//prime all number

import java.util.*;
class prime2
{
	public static void main(String args[])
	{
		int n1 ,n2 , i ,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		n1 =sc.nextInt();
		System.out.println("Enter n2:");
		n2 = sc.nextInt();
		for(i=n1 ; i<=n2 ; i++)
		{
			for(j=2 ;j<i; j++)
			{
			   if(i%j == 0)
				break;
			}
		
		  if(i==j)
			  System.out.println(i + "  ");
		}	

	}
}

/*

Enter n1:
12
Enter n2:
33

13
17
19
23
29
31
*/