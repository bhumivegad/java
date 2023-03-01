// java static nested class

class Outer1
{
    static int data = 30;
    static class Inner
    {
        void msg()
        {
            System.out.println("data is"+data);
        }
    }
    public static void main(String args[])
    {
        Outer1.Inner obj = new Outer1.Inner();
        obj.msg();
    }

}

// data is30