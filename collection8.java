//java non-generic
import java.util.*;
public class collection8 
{
    public static void main(String[] args) 
    {
        Map map = new HashMap();
        map.put(1, " bhumi");
        map.put(3, " ridham");
        map.put(2, " nisha");
        map.put(4, " mira");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+""+entry.getValue());
        }  
    }    
}

/*1 bhumi
2 nisha
3 ridham
4 mira*/