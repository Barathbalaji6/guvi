package aa;

import java.util.*;
class MaxMinSum {
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        int max=0,min=99;
        int a[]=new int[100];
        System.out.println("Enter the number of inputs");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
          System.out.println("Enter the "+(i+1)+"th number");
          a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {  
          if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
      System.out.println("The sum of the maximum and minimum numbers is "+(max+min));
    }
}
