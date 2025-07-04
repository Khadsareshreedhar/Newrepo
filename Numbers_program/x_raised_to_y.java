package Numbers_program;

import java.util.Scanner;

public class x_raised_to_y 
{public static void main(String[] args) 
{
	int x=6,y=2,prod=1;
	while(y>0) 
	{
		prod=prod*x;
		y--;
	}System.out.println("x_raised_to_y ="+prod);
}

}
