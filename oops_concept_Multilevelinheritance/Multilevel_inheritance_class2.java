package oops_concept_Multilevelinheritance;

import java.util.Scanner;

public class Multilevel_inheritance_class2 extends Multilevel_inheritance_class1
{
	 int b;
	 void input()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Pass b value");
		 b=sc.nextInt();
	 }
}
