package Numbers_program;

import java.util.Scanner;

public class Primenumber 
{
 public static void main(String[] args) 
 { 
   int n,count=0,i;
   Scanner sc = new Scanner(System.in);
   System.out.println("Pass number");
   n=sc.nextInt();
   i=1;
   while(i<=n) 
   {
	   if(n%i==0)
		   count=count+1;
	   i=i+1;
   } if(count==2)
	   System.out.println("Is prime");
   else
	   System.out.println("Not prime");
   
 }	
}
	


