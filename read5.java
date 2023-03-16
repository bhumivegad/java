import java.io.*;
public class read5 
{
    public static void main(String[] args) throws Exception
    {
        int b;
        FileInputStream fis = new FileInputStream("c:\\bhumi\\java\\test5.txt");
        DataInputStream dis = new DataInputStream(fis);
        while((b=dis.read())!=-1)
        {
            System.out.print((char)b);
        }
        dis.close();
        fis.close();
    }
}

//o.p. A