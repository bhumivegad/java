import java.util.*;
public class collection11 
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
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);
    }    
} 

/*0= bhumi
1= nilesh
2= kinjal
3= janvi
5= stya */