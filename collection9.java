// java generic
import java.util.*;
public class collection9 
{
    public static void main(String[] args) 
    {
        Map<Integer ,String > map = new HashMap<Integer ,String >();
        map.put(1, " bhumi");
        map.put(0, " ridham");
        map.put(8, " nisha");
        map.put(6, " mira");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+""+entry.getValue());
        }  
    }    
}
/*0 ridham
1 bhumi
6 mira
8 nisha */
