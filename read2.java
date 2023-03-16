// file read2

import java.io.*;
public class read2
{
	public static void main(String args[])
	{
		try
		{
			int b;
			FileInputStream fis = new FileInputStream("c:\\bhumi\\java\\test2.txt");
			while((b = fis.read())!=-1)
			{
				System.out.print((char)b);
			}
			fis.close();
		}	
		catch(Exception e)
		{
			System.out.println("error");
		}
    }
}

//o.p.	hello chiku
		