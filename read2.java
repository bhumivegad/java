import java.io.*;
public class read2 
{
    public static void main(String[] args) throws Exception
    {
        int b;
        FileInputStream fis = new FileInputStream("c:\\bhumi\\java\\test2.txt");
        while((b=fis.read())!=-1)
        {
            System.out.print((char)b);
        }
    }
}

//o.p.
//hello bhumi
