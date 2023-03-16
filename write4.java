import java.io.*;
public class write4 
{
    public static void main(String[] args) throws Exception
    {
        String s="chiku";
        byte b[]=s.getBytes();

        FileOutputStream fos = new FileOutputStream("c:\\bhumi\\java\\test4.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(b);
        bos.close();
        fos.close();
    }
}

//o.p. chiku