import java.util.*;
import java.util.regex.Pattern;
public class Regex3 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches("[amn]", "abcd")); 
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[amn]", "ammna"));
        System.out.println(Pattern.matches("[amn]", "amn"));
        System.out.println(Pattern.matches("[a-dm-p]","h"));     
    }    
}

/*false
true
false
false
false */