import java.io.*;
public class javafile1 
{
    public static void main(String[] args) throws Exception
    {
        String path ="" ;
        boolean bool = false;
        File file = new File("testfile1.txt");
        file.createNewFile();
        System.out.println(file);
        File file2 = file.getCanonicalFile();
        System.out.println(file2);
        bool = file2.exists();
        path=file2.getAbsolutePath();
        System.out.println(bool);
        if(bool)
        {
            System.out.println( path+"Exists?"+bool);
        }
    }    
}

// PS C:\bhumi\java> java javafile1
// testfile1.txt
// C:\bhumi\java\testfile1.txt
// true
// C:\bhumi\java\testfile1.txtExists?true