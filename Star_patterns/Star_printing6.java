package Star_patterns;

import java.util.Scanner;

public class Star_printing6 
{public static void main(String[] args) 
{int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows:");
n = sc.nextInt();

for (int i = 1; i <= n; i++) {
    // Print leading spaces
    for (int space = 1; space < i; space++)
        System.out.print(" ");

    // Print stars
    for (int star = 1; star <= 2 * (n - i) + 1; star++)
        System.out.print("*");

    System.out.println();
    System.out.println("change");
	}
	
}

}
