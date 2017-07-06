#include <stdio.h>

int main()
{
    int a,b,min;
    scanf("%d%d",&a,&b);
    min=(a>b)?a:b;
    while(1)
    {
        if(min%a==0 && min%b==0)
        {
            printf("The lcm of %d and %d is %d",a,b,min);
            break;
        }
        ++min;
    }
    
    return 0;
}
