import java.util.*;

class murphy 
{
	public static void main(String args[]) 
	{
		int n, p, m, c = 0, s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		n = sc.nextInt();
		m = n;
		while(n > 0) {
			c++;
			n = n / 10;
		}
		s = m * m;
		p = (int)Math.pow(10, c);
		n = s % p;
		if(m == n) {
			System.out.println("\n" + m + " is murpy");
		} else {
			System.out.println("\n" + m + " is not murpy");
		}

	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}

//o.p.
//enter no:
//5
//5 is murphy
//enter no:
//7
//7 is not murphy