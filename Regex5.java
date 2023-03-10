import java.util.*;
import java.util.regex.Pattern;
public class Regex5 
{
    public static void main(String[] args) 
    {
        System.out.println("metacharater  d....");
        System.out.println(Pattern.matches("\\d", "abc")); 
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "1234"));
        System.out.println(Pattern.matches("\\d", "3123abc"));

        System.out.println("metacharater  D....");
        System.out.println(Pattern.matches("\\D", "abc")); 
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "1234"));
        System.out.println(Pattern.matches("\\D", "3123abc"));
         
        System.out.println("metacharater D with quantifier");
        System.out.println(Pattern.matches("\\D*", "ms$k"));
    }
}

/*metacharater  d....
false
true
false
false
metacharater  D....
false
false
false
false
metacharater D with quantifier
true */