import java.util.*;  
class collection5
{  
  public static void main(String args[])
  {  
     TreeSet<String> set=new TreeSet<String>();  
         set.add("HIF");  
         set.add("JKL");  
         set.add("jif");
         set.add("jkl");  
         
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
  }  
}

/*jkl
jif
JKL
HIF  */
