package aa;

import java.util.Scanner;

class DecimalToBinary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the decimal:");
		int	n=in.nextInt();
		System.out.println(Integer.toBinaryString(n));
	
	}
}
