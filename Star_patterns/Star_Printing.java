package Star_patterns;

import java.util.Scanner;
//   *
//   **
//   ***
//   ****



public class Star_Printing 
{
 public static void main(String[] args) 
 { 
	int n; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Pass number");
	n=sc.nextInt();
	for(int i=1;i<=n;i++) 
	{
		for(int j=1;j<=i;j++) 
		{
		  System.out.print(i+j);	
		} 
			System.out.println();
	}
 }
}
