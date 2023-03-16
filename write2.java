import java.io.*;
public class write2
{
	public static void main(String args[])throws Exception
	{
		String s="hello chiku";
		FileOutputStream fos = new FileOutputStream("c:\\bhumi\\java\\test2.txt");
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
}	