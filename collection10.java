// java comparing  by value
import java.util.*;
import java.util.stream.Stream;
public class collection10 
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
        .sorted(Map.Entry.comparingByValue())
        .forEach(System.out::println);
    }    
}

/*0= bhumi
3= janvi
2= kinjal
1= nilesh
5= stya */