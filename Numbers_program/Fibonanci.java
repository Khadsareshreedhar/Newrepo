package Numbers_program;

import java.util.Scanner;

public class Fibonanci 
{
	public static void main(String[] args) 
	{
	 int x=0,y=1,z=0,n=10,term=1;
	 while(term<=n) 
	 {
		 System.out.println(z);
		 x=y;
		 y=z;
		 z=x+y;
		 term=term+1;
	 }
	 
	}
}
