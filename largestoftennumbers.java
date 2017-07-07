package aa;

import java.util.Scanner;

public class LargestOfTen {
	public static void main(String[] args) {
		
	
	int a[] = new int[10];
	int t = 0;
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		if(a[i]>t)
		{
			t=a[i];
		}
			
	}
	System.out.println("The Largest Number Is "+t);
	}

}
