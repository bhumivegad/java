import java.io.*;
public class chararry1 
{
    public static void main(String[] args) throws Exception
    {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcom");    
          FileWriter f1=new FileWriter("a.txt");    
          FileWriter f2=new FileWriter("b.txt");    
          FileWriter f3=new FileWriter("c.txt");    
          FileWriter f4=new FileWriter("d.txt");    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    
          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
    }   
               
}    

//o.p. Success...
//a.txt = Welcom
//b.txt = Welcom
//c.txt = Welcom
//d.txt = Welcom