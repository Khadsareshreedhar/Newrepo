package Numbers_program;

import java.util.Scanner;

public class Palindrome_number
{public static void main(String[] args) 
 {
	int n,rev=0,z;
	Scanner sc = new Scanner(System.in);
	System.out.println("Pass number");
	n=sc.nextInt();
	z=n;
	while(n>0) 
	{
		
		rev=rev*10+n%10;
		n=n/10;
		
		
	}if(z==rev) 
		System.out.println("it is Palindrome number");
	else
		System.out.println("it is Not Palindrome number");
 }

}
