#include <stdio.h>
int main()
{
   int num1, num2, *a, *b, sum;
   printf("Enter two integers to add\n");
   scanf("%d%d", &num1, &num2);
   a = &num1;
   b = &num2;
   sum = *a + *b;
   printf("Sum of entered numbers = %d\n",sum);
   return 0;
}
