import java.io.*;
import java.util.StringTokenizer;
public class javastring2 
{
     public static void main(String[] args) 
    {
        StringTokenizer st=new StringTokenizer("hello i am chiku"," ");
        System.out.println("Total number of Token:"+st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }    
    }
}

/*o.p.
Total number of Token:4
hello
i
am
chiku */