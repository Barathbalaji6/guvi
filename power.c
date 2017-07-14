#include <stdio.h>
int power(int n);
int main(void) {
	// your code goes here
	int a;
	scanf("%d",&a);
	power(a);
	return 0;
}

int power(int n)
{
    if((n!=0)&&(n = & (n-1))==0)
    printf("Answer=yes");
    else 
    printf("Answer=No");
}
