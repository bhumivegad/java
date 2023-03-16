import java.io.*;
public class write5 
{
    public static void main(String[] args) throws Exception
    {
        String s="chiku";
        byte b[]=s.getBytes();

        FileOutputStream fos = new FileOutputStream("c:\\bhumi\\java\\test5.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(65);
        dos.close();
        fos.close();
    }
}

//o.p. A