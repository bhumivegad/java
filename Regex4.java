import java.util.*;
import java.util.regex.Pattern;
public class Regex4 
{
    public static void main(String[] args) 
    {
        System.out.println("? quantifier....");
        System.out.println(Pattern.matches("[amn]?", "a")); 
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]?", "azzta"));
        System.out.println(Pattern.matches("[amn]?", "ammna"));
        System.out.println(Pattern.matches("[amn]?","amn")); 
        
        System.out.println("+ quantifier....");
        System.out.println(Pattern.matches("[amn]+", "a")); 
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "azzta"));
        System.out.println(Pattern.matches("[amn]+", "ammna"));
        System.out.println(Pattern.matches("[amn]?","amn"));

        System.out.println("* quantifier....");
        System.out.println(Pattern.matches("[amn]*", "ammna"));
    }    
}

/*? quantifier....
true
false
false
false
false
+ quantifier....
true
true
false
true
false
* quantifier....
true */