package Numbers_program;

public class Product_of_digit 
{
	public static void main(String[] args) 
	{
		int n=265,pro=1;
		while(n>0) 
		{
			pro=pro*(n%10);
			n=n/10;
		}System.out.println("product of number = "+pro);
	}
}