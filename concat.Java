package aa;

import java.util.Scanner;

public class Concat {
	public static void main(String[] args) {
		String s1,s2;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1=in.nextLine();
		System.out.println("Enter the second string");
		s2=in.nextLine();
		System.out.println(s1+""+s2);
	}

}
