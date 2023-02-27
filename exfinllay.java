public class exfinllay 
{
    public static void main (String args[])
    {
        int a,b,c;
        try
        {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a/b;
            System.out.println("c = "+c);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index error");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic error");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Type mismatch error");
        }
        finally
        {
            System.out.println("end");
        }
    }    
}

/* 32/1 
 Type mismatch error
end 
 */
