package Array;

import java.util.Scanner;

public class Array 
{public static void main(String[] args) 
{
	int a[] = new int [10];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<10;i++) 
	{
		System.out.println("Enter No");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++) 
	{
		System.out.println(a[i]);
	}
}

}
