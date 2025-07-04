package scanner_Class;

import java.util.Scanner;

public class More_than_zero 
{public static void main(String[] args) 
{
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Pass Number");
	a=sc.nextInt();
	if(a>0)
		System.out.println("Value is more than zero");
	else if (a<0) {
		System.out.println("Value is Less than zero");
	}
	else {
		System.out.println("Value is zero");
	}
		
}

}
