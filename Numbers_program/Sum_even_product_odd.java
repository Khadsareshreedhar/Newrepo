package Numbers_program;

import java.util.Scanner;

public class Sum_even_product_odd 
{public static void main(String[] args) 
{
  int n=2345;
  int sum=0,pro=1,digit;
  while(n>0) 
  {
	  digit=n%10;
	  if(n%2==0)
		  sum=sum+digit;
	  else
		  pro=pro*digit;
	  n=n/10;
  }System.out.println("Sum of even = "+sum+" & Sum of odd = "+pro);
}	

}
