package scanner_Class;

import java.util.Scanner;

public class Odd 
{public static void main(String[] args) 
 {	
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Number");
	a=sc.nextInt();
	if(a%2==0)
	System.out.println("Even number");	
	else
		System.out.println("odd number");
 }

}
