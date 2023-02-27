// anonymousInner class
abstract class person
{
    abstract void eat();
}
class testanonymous
{
    public static void main(String[] args) 
    {
        person p =new person() 
        {
            void eat()
            {
                System.out.println("nice fruits");
            }
            
        };
        p.eat();    
    }
}

// nice fruits