package aa;

import java.util.Scanner;

import static java.lang.Math.pow;


public class PowerOfTwo {
    public static void main(String[] args){
        int i,num;
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        @SuppressWarnings("unused")
		int count=0;
        num=sc.nextInt();
        for (i=1;i<=num;i++) {
            if(num==pow(i,2))
                System.out.println(num+"  is a power of two");
           else
                System.out.println(num+"  is not power of two");



        }
        }
    }
