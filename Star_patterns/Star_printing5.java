package Star_patterns;

import java.util.Scanner;

public class Star_printing5 
{
 public static void main(String[] args) 
 {
     int n, i, b, j;
     Scanner sc = new Scanner(System.in);
     System.out.println("Pass number");
     n = sc.nextInt();

     for(i = 1; i <= n; i++) {
         // Print spaces
         for(b = 1; b <= (n - i); b++) {
             System.out.print(" ");
         }
         // Print stars
         for(j = 1; j <= (2 * i - 1); j++) {
             System.out.print("*");
         }
         System.out.println(); // Move to the next line
     }
 }
}
