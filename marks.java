import java.util.*;

 class  marks
 {
	 public static void main(String args[])
	 {
		 int marks1, marks2, marks3;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter marks of three sub:");
		 marks1= sc.nextInt();
		 marks2= sc.nextInt();
		 marks3= sc.nextInt();
		 if(marks1>=40 && marks2>=40 && marks3>=40)
         {
			 System.out.println("your are pass");
		 }
		 else if(marks1>=40 && marks2>=40 && marks3>=40)
		 {
			 System.out.println("atkt");
		 }
		 else if(marks1>=40 && marks2>=40 && marks3<40)
		 {
			 System.out.println("atkt");
		 }
		 else
		 {
			System.out.println("fail"); 
		 }
	 }
 }