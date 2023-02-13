import javax.swing.plaf.synth.SynthOptionPaneUI;

class string2
{
	public static void main(String args[])
	{
		String s1 ="string  using literal";
		String s2 = new String("string using new");
		char c1[]={'a','b','c'};
		String s3 = new String(c1);
		System.out.println("s3="+s3);
		//char charAt(int index)
     	System.out.println("charAt(3)="+s1.charAt(3));
		//String substring(int beginIndex)
		System.out.println("substring(7,12)="+s1.substring(7,12));
		//boolean contains(CharSequence s)
     	System.out.println("contains(u)="+s1.contains("u"));
		//static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
		System.out.println("join(aa,bb)="+s1.join("&","a","b","c"));
		//boolean equals(Object another)
		String s4 = "abcd";
		if(s3.equals(s4))
			System.out.println("same");
		else
		 	System.out.println("different");


        //boolean isEmpty()
	    String s5="java"; 
        String s6="";
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());

		//
		String fname="bhumi";
		String lname="vegad";
		System.out.println(fname.concat(lname));

		//String replace(char old, char new)
		String s8 = "Hello";
		System.out.println(s8.replace('l', 'p'));

		//tatic String equalsIgnoreCase(String another)
		String s9 ="java";
		String s10 ="JAVA";
		String s11 ="another String";
		System.out.println(s9.equalsIgnoreCase(s10));
		System.out.println(s9.equalsIgnoreCase(s11));

		//String[] split(String regex)
		String str = "hello java";
        String[] arrofStr = str.split("@", 2);
		for (String a :arrofStr )
            System.out.println(a);

         //String[] split(String regex, int limit)
		 String Str = new String("Welcome-to-java");
		 System.out.println("Return Value :" );
		 for (String retval: Str.split("-", 2)) 
			System.out.println(retval);

		 //String intern()
		 String s12=new String("hello");  
		 String sa="hello";  
		 String sb=s12.intern();//returns string from pool, now it will be same as s2  
		 System.out.println(s1==sa);//false because reference variables are pointing to differeninstance  
         System.out.println(s2=sb);//true because reference variables are pointing to same instance 
		 
		
	}
     
		
}

//o.p.
/*s3=abc
charAt(3)=i
substring(7,12)= usin
contains(u)=true
join(aa,bb)=a&b&c
different
false
true
bhumivegad
Heppo
true
false
hello java
Return Value :
Welcome
to-java
false
hello */