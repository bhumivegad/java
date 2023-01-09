// for loop...

import java.util.*;

class for1
{
   public static void main(String args[])
   {
     int n , i;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a num");
	 n = sc.nextInt();
	 for( i=0 ; i<=n ; i++)
	 {
	   System.out.println(i + " ");
	 }
	 for(i=0 ; i<=n ; ++i)
	 {
	   System.out.print(i + " ");
	 }
	 // n value can 10 then print is 11
	 for(i=0 ; i<=n ; i++);
	 {
	   System.out.print(i + " ");
	 }
   }
}