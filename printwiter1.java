import java.io.*;
public class printwiter1 
{
  public static void main(String[] args) throws Exception
  {
    PrintWriter writer = new PrintWriter(System.out);
    writer.write("vegad bhumi");
    writer.flush();
    writer.close();
    PrintWriter writer1 = null;
    writer1 = new PrintWriter(new File("testout.txt"));  
    writer1.write("hello Java");                                                   
                    writer1.flush();  
    writer1.close();  
    
  }    
}

//vegad bhumi