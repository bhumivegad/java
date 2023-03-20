import java.io.*;
public class Reader1 
{
    public static void main(String[] args) throws Exception
    {
        try
        {  
            FileReader reader = new FileReader("testout.txt");  
            int data = reader.read();  
            while (data != -1) 
            {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } 
        catch (Exception ex) 
        {  
            System.out.println(ex.getMessage());  
        }  
    }
}
