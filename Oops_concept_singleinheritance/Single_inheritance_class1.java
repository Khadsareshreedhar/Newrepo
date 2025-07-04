package Oops_concept_singleinheritance;

import java.util.Scanner;

public class Single_inheritance_class1
{
 int a,b;
 void input() 
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("First name");
	 a=sc.nextInt();
	 System.out.println("Second name");
	 b=sc.nextInt();
 }
 void add() 
 {
	 System.out.println("Additional of a,b = "+(a+b));
 }
}
