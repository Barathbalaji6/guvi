package aa;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2 ; i<num ; i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
