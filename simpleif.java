import java.util.*;

class simpleif
{
	public static void main(String arg[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are elligible for voting");
		}
		else{
		     System.out.println("NOT");
		}
	}
}