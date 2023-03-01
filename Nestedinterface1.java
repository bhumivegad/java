interface Showable
{
    Void show();
    interface Message
    {
        void msg();
    }
}
class Nestedinterface1 implements Showable.Message 
{
    public void msg()
    {
        System.out.println("helllo");
    }
    public static void main(String[] args) 
    {
        Showable.Message message = new Nestedinterface1(); //upcasting here 
        message.msg();
    }
}

// helllo