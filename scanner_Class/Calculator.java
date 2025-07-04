package scanner_Class;

import java.util.Scanner;

public class Calculator 
{public static void main(String[] args) 
{   int a,b,cal;
	Scanner sc = new Scanner(System.in);
    System.out.println("Pass a numbers");
    a=sc.nextInt();
    System.out.println("Pass b numbers");
    b=sc.nextInt();
    System.out.println("Use calculator 1->add,2->sub,3->multiply,4->divide");
    cal=sc.nextInt();
    if(cal==1)
    	System.out.println("Addition = "+(a+b));
    else if (cal==2)
    {System.out.println("Sub = "+(a-b));
		
	}
    else if (cal==3)
    {System.out.println("Mult = "+(a*b));
		
	}
    else if (cal==4)
    {System.out.println("Divide = "+(a/b));
		
	}else
	{ 
		System.out.println("Invalid choice");
	}
}

}
