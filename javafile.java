import java.io.File;

public class javafile 
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("test1.txt");
        if(file.createNewFile())
        {
            System.out.println("NEW FILE IS CREATED!");
        }  
        else
        {
            System.out.println("File already exists");
        }  
    }    
}

// NEW FILE IS CREATED!
//File already exists
