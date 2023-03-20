import java.io.*;
public class printstrm1 
{
  public static void main(String[] args) throws Exception
  {
    FileOutputStream fout=new FileOutputStream("estout.txt ");    
    PrintStream pout=new PrintStream(fout);    
    pout.println(2001);    
    pout.println("bhumi");    
    pout.println("vegad");    
    pout.close();    
    fout.close();    
   System.out.println("Success...");    
  }    
}  
//2001
// bhumi
// vegad