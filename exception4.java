import java.util.*;
class exception4 
{
    static void func1()
    {
        System.out.println("func1");
        try
        {
            func2();
        }
        catch (Exception e)
        {
            System.out.println("catch fun1");
        }
    }
    static void func2()
    {
        System.out.println("func2");
        try
        {
            func3();
        }
        catch (NumberFormatException e)
        {
            System.out.println("catch fun2");
        }
    }
    static void func3()
    {
        System.out.println("func3");
        try
        {
            func4();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("catch fun3");
            throw e;
        }
    }
    static void func4()
    {
        System.out.println("func4");
        try
        {
           Scanner sc = new Scanner(System.in);
           int a,b,c;
           System.out.println("Enter two nos");
           a = sc.nextInt();
           b = sc.nextInt();
           c = a/b;
           System.out.println(("c = "+c));
        }
        catch (Exception e)
        {
            System.out.println("catch fun4");
            throw e;
        }
    }
    public static void main (String args[])
    {
        func1();
    }
}

/*o.p.=
func1
func2
func3
func4
Enter two nos
66
0
catch fun4
catch fun1 */