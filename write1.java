import java.io.*;
public class write1
{
	public static void main(String args[])
	{
		try
		{
			
			FileOutputStream fos = new FileOutputStream("c:\\bhumi\\java\\test1.txt");
			fos.write(65);
		    fos.close();
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
    }
}	

//o.p. c