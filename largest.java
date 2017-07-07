package barath;

import java.util.Scanner;

class Largest
{
   
public static void main(String args[])
   {
      int a,b,c;
      System.out.println("Enter three integers ");
      @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
 
      if ( a > b && a > c )
         System.out.println(a+" is largest.");
      else if ( b > a && b > c )
         System.out.println(b+" is largest.");
      else if ( c > a && c > b )
         System.out.println(c+" is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }

}
