package Numbers_program;

import java.util.Scanner;

public class Reverse_number 
{
	public static void main(String[] args)
	{
		int n=123,rev=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Pass number for reverse");
//		n=sc.nextInt();
		while(n>0) 
		{
			rev=rev*10+n%10;
			n=n/10;
		}System.out.println("Reverse number = "+rev);
	}
}
