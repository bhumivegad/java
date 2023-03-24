//java String Tokenizer 

import java.io.*;
import java.util.StringTokenizer;
public class javastring 
{
    public static void main(String[] args) 
    {
        StringTokenizer st=new StringTokenizer("hello i am chiku","");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }    
    }
}

/*hello i am chiku */