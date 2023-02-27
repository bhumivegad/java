//Innerclass Nested

class testinner1 
{
    private int data=30;
    class Inner
    {
        void msg()
        {
            System.out.println("data is"+data);
        }
    }
    public static void main(String[] args) 
    {
        testinner1 obj = new testinner1();
        testinner1.Inner in = obj.new Inner();
        in.msg();    
    }   
}

// data is30