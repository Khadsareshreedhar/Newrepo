package scanner_Class;

import java.util.Scanner;

public class Switch_case 
{public static void main(String[] args) 
 {int a,b,cal;
	Scanner sc = new Scanner(System.in);
    System.out.println("Pass a numbers");
    a=sc.nextInt();
    System.out.println("Pass b numbers");
    b=sc.nextInt();
    System.out.println("Use calculator 1->add,2->sub,3->multiply,4->divide");
    cal=(int) sc.nextFloat();
    switch(cal) 
    {
    case 1:
          System.out.println("Addition = "+(a+b));
          break;

    case 2:
          System.out.println("Subtraction = "+(a-b));
          break;
    case 3:
        System.out.println("multiply = "+(a*b));
        break;
    case 4:
        System.out.println("divide = "+(a/b));
        break;
    default:
        System.out.println("Invalide command");
            
    }
    
    
	
 }

}
