#include<stdio.h>
#include<conio.h>
int main()
{
int i ;
odd=0;                                  
even=0;
clrscr();

for( i=1 ; i<=15 ; i++ )
{
if(i%2 ==0)
{
even =even+ i;
}
}
for( i=15 ; i<=45 ; i++ )
{
if(i%2 !=0)
{
odd=odd+i;
}
}
printf(" Sum of Odd Numbers = %d" , odd);
printf(" Sum of Even Numbers = %d" , even);
getch();
return 0;
}
