package scanner_Class;

import java.util.Scanner;

public class Area 
{ 
 public static void main (String []args) 
 {
	 int len,bre,Area;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Add lenght");
	 len=sc.nextInt();
	 System.out.println("Add Breath");
	 bre=sc.nextInt();
	 Area=len*bre;
	 System.out.println("Total Area= "+Area);
			 
	
 } 
}
