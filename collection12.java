//java reversOrder
import java.util.*;
public class collection12 
{
    public static void main(String[] args) 
    {
        Map map = new HashMap();
        map.put(0 , " bhumi");
        map.put(2 ," kinjal");
        map.put(1," nilesh");
        map.put(3, " janvi");
        map.put(5, " stya");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        .forEach(System.out::println);
    }    
} 

/*5= stya
3= janvi
2= kinjal
1= nilesh
0= bhumi */
