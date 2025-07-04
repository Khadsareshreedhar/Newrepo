package Numbers_program;

//import java.util.Scanner;

public class prime_beetween //prime no beetween 1 to 100
{public static void main(String[] args) 
 { 
	int i,count=0,j;
	for( i=1; i<=100; i++)
	{
		count=0;
		for(j=1;j<=i;j++) 
		{
			if(i%j==0)
				count++;
		} if (count==2)
		System.out.println(i);
	}
			
 }

}
