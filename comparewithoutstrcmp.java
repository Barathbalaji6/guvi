package aa;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter the first string");
		s1=in.nextLine();
		System.out.println("Enter the second string");
		s2=in.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
