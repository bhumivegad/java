 class Enum 
{
    //defining the enum inside the class
    
    public enum season{WINTER,SPRING,SUMMER,FAIL}
    
    //main method

    public static void main(String args[]) 
    {
        //trversing the num 
        
        for(season s:season.values())

             System.out.println(s);
            
        System.out.println("value of WINTER is :"+season.valueOf("WINTER"));    
        System.out.println("value of WINTER is :"+season.valueOf("WINTER").ordinal());   
        System.out.println("value of SUMMER is :"+season.valueOf("SUMMER").ordinal());    
    }
}

// WINTER
// SPRING
// SUMMER
// FAIL
// value of WINTER is :WINTER
// value of WINTER is :0
// value of SUMMER is :2