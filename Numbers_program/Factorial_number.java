package Numbers_program;

import java.util.Scanner;

public class Factorial_number
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("pass number");
	int n,fact=1;
	n=sc.nextInt();
	while(n>0) 
	{
		fact=fact*n;
		n=n-1;
	}System.out.println("Factorial number is ="+fact);
 }
}
