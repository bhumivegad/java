import java.util.Iterator;
import java.util.LinkedHashSet;

public class collection7 
{
    public static void main(String args[])
    {  
        //Creating HashSet and adding elements  
        LinkedHashSet<String> set = new LinkedHashSet<String>();  
        set.add("bhumi");    
        set.add("ridham");    
        set.add("ridham");   
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
    }  
    
}    

/*bhumi
 * ridham
 */