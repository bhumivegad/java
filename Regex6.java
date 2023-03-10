import java.util.*;
import java.util.regex.Pattern;
public class Regex6 
{
    public static void main(String[] args) 
    {
       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","bhumi7")); 
       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","Bbhumi07"));
       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","bh7mi1"));
       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","bhum!7"));
       System.out.println(Pattern.matches("[a-zA-z0-9]{6}","nish"));
    } 
}

/*true
false
true
false
false */