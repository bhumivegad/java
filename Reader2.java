import java.io.*;  
public class Reader2 
{  
    public static void main(String args[])throws Exception
    {    
          FileReader fr=new FileReader("testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1)
          {  
            System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}  

//o.p. welcome