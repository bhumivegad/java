import java.io.*;
public class outputstrm1
{
    public static void main(String args[]) 
    {  
      try 
        {  
            OutputStream outputStream = new FileOutputStream("output.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);    
            outputStreamWriter.write("Hello");  
            outputStreamWriter.close();  
        } 
        catch (Exception e) 
        {  
            e.getMessage();  
        }  
    }  
}  