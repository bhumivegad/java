import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex8 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("enter regex pattern");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("enter text:");
            Matcher  matcher=pattern.matcher(sc.nextLine());
            boolean found = false;

            while(matcher.find())
            {
                System.out.println("1 found the text"+matcher.group()+"staring at index"+matcher.start()+"and ending at index"+matcher.end());
                found = true;
            }
            if(!found)
            {
                System.out.println("no match found");
                break;
            }
        
        }    
    }    
}

/*enter regex pattern
123
enter text:
bhumi123
1 found the text123staring at index5and ending at index8
enter regex pattern */