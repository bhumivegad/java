// local inner class

public class localinner 
{
    private int data = 7;
    void disp()
    {
        class local
        {
            void msg()
            {
                System.out.println("data");
            }
        }
        local l = new local();
        l.msg();
    }  
    public static void main(String[] args) 
    {
        localinner obj = new localinner();
        obj.disp();    
    }  
}

// data