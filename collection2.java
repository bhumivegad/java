//stack in java
import java.util.*;
public class collection2 
{
    public static void main(String args[]) 
    {
        Stack<String>Stack = new Stack<String>();
        Stack.push("bhumi");
        Stack.push("ridham");
        Stack.push("nisha");
        Stack.push("mira");
        Iterator<String>itr= Stack.iterator(); 
        
        System.out.println("pop(Delected)="+Stack.pop());
        Iterator<String>itr1 = Stack.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }    
}

/*pop(Delected)=mira
bhumi
ridham
nisha */