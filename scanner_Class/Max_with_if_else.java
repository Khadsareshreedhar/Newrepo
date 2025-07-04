package scanner_Class;

import java.util.Scanner;

public class Max_with_if_else 
{	
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		 System.out.println("A");
		 a=sc.nextInt();
		 System.out.println("B");
		 b=sc.nextInt();
		 System.out.println("C");
		 c=sc.nextInt();
		 
		 if (a>b && a>c)
	        System.out.println("max a= "+a);
		 else if(b>a && b>c)
		    System.out.println("Max b= "+b);
		 else
			 System.out.println("Max c= "+c);
	   	
	}


}
