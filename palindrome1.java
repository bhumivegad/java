// palindrome number

import java.util.*;
class palindrome1
{
   public static void main(String args[])
   {
	   int r ,n,s=0 , t;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter n:");
	   n= sc.nextInt();
	   t = n ;
	   while(n>0)
		{
			r = n%10;
			s =(s*10)+r;
			n =n/10;
		}
		if(t==s)
			System.out.println("palindrome");
		else
			System.out.println("NOT");
   }
}

// Enter n:sum=(sum*10)+r;  
  // 121
  // palindrome
  
  //Enter n:
  //123
  //NOT