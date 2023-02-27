import java.util.*;
class Exception2
 {
    public static void main(String args[])
    
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        try
        {
           a = sc.nextInt();
           b = sc.nextInt();
           c = a/b;
           System.out.println("c ="+c);
        }
        catch(Exception e)
        {
            System.out.println("error="+e);
        } 
        System.out.println("end");
    }       
 } 
    
// 36
// 6
// c =6
// end
