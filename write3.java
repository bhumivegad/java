import java.io.*;
import java.util.*;
public class write3 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s;
        FileOutputStream fos = new FileOutputStream("c:\\bhumi\\java\\test3.txt"); 
        while(true)
        {
            System.out.println("Enter String :");
            s = sc.nextLine();
            if(s.length()==0)
            break;
            byte b[]=s.getBytes();
            fos.write(b);
        }    
        fos.close();
    }    
}

//Enter String :
//hello chiku
//Enter String :
//o.p.  hello chiku