//file directroy list and details
import java.io.*;
public class javafile3 
{
    public static void main(String[] args) 
    {
        File dir=new File("c:\\bhumi\\java");  
        File files[]=dir.listFiles();
        System.out.println("file name \t can write \t Is Hidden \t size");
        for(File file:files)
        {
            System.out.println(file.getName()+"\t"+file.canWrite()+"\t"+file.isHidden()+"\t"+file.length()+"\t"+"bytes");
        }  
    }    
}

/*
file name        can write     Is Hidden size
write1.java     true    false   305     bytes
write2.java     true    false   356     bytes
write3.java     true    false   635     bytes
write4.class    true    false   651     bytes
write4.java     true    false   415     bytes
write5.class    true    false   647     bytes
write5.java     true    false   404     bytes
Writer.class    true    false   670     bytes
Writer.java     true    false   490     bytes
write_1.java    true    false   429     bytes */