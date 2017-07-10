#include<stdio.h>
#include<conio.h>
void main()
{
  int x[100],n,i,temp,less;
  clrscr();
  printf("Enter no of elements in array :");
  scanf("%d",&n);
  printf("Enter the array elements : ");
  for(i=0;i<n;i++)
  {
    scanf("%d",&x[i]);
  }
  temp = x[0];
  less = x[0];
  for(i=0;i<n;i++)
  {
    if(x[i]>temp)
    {
      temp = x[i];
    }
  }
  for(i=0;i<n;i++)
  {
    if(x[i]<less)
    {
      less = x[i];
    }
  }
  printf("The highest element %d and the lowest element %d",temp,less);
  getch();
}
