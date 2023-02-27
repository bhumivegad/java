 class MyException extends Exception
{
    MyException(String s)
    {
        super (s);
    }    
}
class exception5
{
    public static void main (String args[])
    {
        try
        {
            throw new MyException("ERROR FOUND");
        }
        catch (MyException e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}


/* o.p.= 
MyException: ERROR FOUND
ERROR FOUND */