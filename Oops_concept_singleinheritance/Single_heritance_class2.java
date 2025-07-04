package Oops_concept_singleinheritance;

import java.util.Scanner;

public class Single_heritance_class2 extends Single_inheritance_class1 
{
 int c;
 void getdata() 
 {
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("Pass c Number");
	 c=sc1.nextInt();
 }
 void display() 
 {
	 System.out.println("Additional of a,b,c = "+(a+b+c));
 }
 
}
