package Numbers_program;

import java.util.Scanner;

public class Armstrong_number 
{public static void main(String[] args) 
{ 
	int n,z,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("pass number");
	n=sc.nextInt();
	z=n;
	while(z>0) 
	{
		count=count+1;
		z=z/10;
	}System.out.println("No of digit"+count);
	
}

}
