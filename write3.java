//file write3
import java.io.*;
import java.util.*;
public class write3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		FileOutputStream fos=new FileOutputStream("c:\\bhumi\\java\\test3.txt");
		while(true)
		{
			System.out.println("Enter String");
			s = sc.NextLine();
			if(s.length()==0)
				break;
			byte b[]=s.getBytes();
			fos.write(b);
		}
		fos.close();
    }
}	