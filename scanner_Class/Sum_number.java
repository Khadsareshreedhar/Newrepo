package scanner_Class;

import java.util.Scanner;

public class Sum_number  //Find Sum of First N Natural Numbers
{public static void main(String[] args) 
{ 
  Scanner sc = new Scanner(System.in);
  System.out.println("Pass number");
  int n,i,add=0;
  n=sc.nextInt();
  i=1;
  while(i<=n) 
  {
	  System.out.println(i);
	  add=add+i;
	  i=i+1;
  }System.out.println("adding ="+add);
}

}
