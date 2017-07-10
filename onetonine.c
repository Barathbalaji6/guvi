#include<stdio.h>
#include<conio.h>
void main()
{
int x;
clrscr();
printf("Enter a number between 1 to 9 : ");
scanf("%d",&x);
if(x < 1 || x > 9)
{
printf("Error! Enter a valid Input");
}
getch();
}
