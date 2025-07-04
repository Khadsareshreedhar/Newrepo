package oops_concept_Multilevelinheritance;

import java.util.Scanner;

public class Multilevel_inheritance_class3 extends Multilevel_inheritance_class2
{
	 int c;
	 void dispay()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Pass c value");
		 c=sc.nextInt();
	 }
	 
	 void add() 
	 {
		 System.out.println("additional a,b,c = " +(a+b+c));
	 }
}
