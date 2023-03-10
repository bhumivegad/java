import java.util.*;
import java.util.regex.Pattern;
public class Regex7 
{
    public static void main(String args[])
	{
		System.out.println("by character class and quantifier");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9898989898"));
		System.out.println(Pattern.matches("[789][0-9]{9}","9953099530"));
		System.out.println(Pattern.matches("[789][0-9]{9}","99530995309"));
		System.out.println(Pattern.matches("[789][0-9]{9}","6953099530"));
		System.out.println(Pattern.matches("[789][0-9]{9}","8953089530"));
		
		System.out.println("by character class and quantifier");
		System.out.println(Pattern.matches("[789]{1}\\d{9}","8953089530"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}","3953039530"));
	}
}

/*by character class and quantifier
true
true
false
false
true
by character class and quantifier
true
false */