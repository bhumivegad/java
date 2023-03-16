import java.io.*;
public class read1
{
	public static void main(String args[])
	{
		try
		{
			int b;
			FileInputStream fis = new FileInputStream("c:\\bhumi\\java\\test1.txt");
			b = fis.read();
			System.out.println((char)b);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
    }
}	

//o.p. c