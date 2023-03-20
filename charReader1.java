import java.io.*;
public class charReader1 
{
    public static void main(String[] args) throws Exception
    {
        char[] ary ={'b','h','u','m','i'};
        CharArrayReader reader = new CharArrayReader(ary);
        int k=0;
        while((k=reader.read())!=-1)
        {
            char ch =(char)k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}

// o.p.
// b : 98
// h : 104
// u : 117
// m : 109
// i : 105