#include <stdio.h>
int main(void)
{
	int x,i,j,k,a[1000];
		scanf("%d",&x);
	for(i=0;i<x;i++)
		scanf("%d",&a[i]);
	for(i=0;i<x;i++)
	{
		for(j=0;j<x;j++)
		{
			for(k=0;k<x;k++)
			{
				if(a[i]+a[j]==a[k])
					printf("%d %d %d\n",i,j,k);
			}
		}
	}
	return 0;
}
