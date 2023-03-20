import java.io.*;
import java.util.*;
import java.io.FileWriter;  
public class Writer 
{  
    public static void main(String args[])
    {    
         try
         {    
           FileWriter fw=new FileWriter("testout.txt");    
           fw.write("Welcome");    
           fw.close();    
          }catch(Exception e)
          {
            System.out.println(e);
          }    
          System.out.println("Success...");    
     }    
}  

//Welcome



