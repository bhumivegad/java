// file directory list
import java.io.*;
public class javafile2 
{
    public static void main(String[] args) 
    {
        File f=new File("c:\\bhumi\\java");
        String filenames[]=f.list();
        for(String filename:filenames)
        {
            System.out.println(filename);
        }

    }
}

/*write1.java
write2.java
write3.java
write4.class
write4.java
write5.class
write5.java
Writer.class
Writer.java
write_1.java */