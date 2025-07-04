package scanner_Class;

import java.util.Scanner;

public class While_loop_scanner 
{
	public static void main(String[] args) 
	{ 
		 
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Print u want numbers");
		n=sc.nextInt();
		i=1;
		while(i<=n) 
		{
			System.out.println(i);
			i=i+1;
		}
	}
}
