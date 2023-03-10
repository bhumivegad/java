//
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 
{
    public static void main(String[] args) 
    {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        boolean b3= Pattern.matches(".s", "b1");
        System.out.println(b+ " "+ b2 + " "+ b3);     
    }    
}

/*true true false */