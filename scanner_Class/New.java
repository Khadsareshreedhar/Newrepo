package scanner_Class;

import java.util.Scanner;

public class New 
{public static void main(String[] args) 
{ Scanner sc = new Scanner(System.in);
  System.out.println("Send numbers");
  int i,n,add=0;
  n=sc.nextInt();
  i=1;
  while(i<=n) 
  {
	  System.out.println(i);
	  add=add+i;
	  i=i+1;
	  
  }System.out.println("addding"+add);
}

}
