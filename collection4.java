//
import java.util.*;
public class collection4 
{
  public static void main(String[] args) 
  {
    Deque<String>deque = new ArrayDeque<String>();
    deque.add("ABC");
    deque.add("abc");
    deque.add("DEF");
    deque.add("def");
    for(String Str:deque)
       {
         System.out.println(Str);
       }  
  }      
}

/*ABC
abc
DEF
def */