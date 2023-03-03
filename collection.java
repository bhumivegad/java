import java.util.*;  
class collection
{  
    public static void main(String[] args)
    {  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("bhumi");//Adding object in arraylist  
        list.add("ridham");  
        list.add("nisha");  
        list.add("kinjal");  
        //Traversing list through Iterator  
        Iterator itr=list.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  


        ArrayList list1=new ArrayList();//Creating arraylist  
        Integer i1 = 15;
        list1.add(i1);//Adding object in arraylist  
        list1.add("bhumi");  
        list1.add(40.50);  
        list1.add("ridham");  
        //Traversing list through Iterator  
        Iterator itr1=list1.iterator();  
        while(itr1.hasNext())
        {  
            System.out.println(itr1.next());  
        }  
    }  
}  

/*bhumi
ridham
nisha
kinjal
15
bhumi
40.5
ridham */