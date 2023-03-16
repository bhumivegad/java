import java.io.*;
public class read4 
{
    public static void main(String[] args) throws Exception
    {
        int b;
        FileInputStream fis = new FileInputStream("c:\\bhumi\\java\\test4.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        while((b=bis.read())!=-1)
        {
            System.out.print((char)b);
        }
        bis.close();
        fis.close();
    }
}

//o.p. chiku