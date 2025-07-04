package Numbers_program;

import java.util.Scanner;

public class Sumof_digits_ofnumbers 
{public static void main(String[] args) 
{
	int n,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Pass number used for sum");
	n=sc.nextInt();
	while(n>0) 
	{
		sum=sum+n%10;
		n=n/10;
	}System.out.println("Sum of Digits of a Number = "+sum);
	
}

}
