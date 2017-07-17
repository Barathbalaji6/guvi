#include "stdio.h"

int main(void) {
    char c;
    setvbuf(stdout, NULL, _IONBF, 0);
    printf("enter the character: ");
    scanf("%c",&h);
    printf("%d",(int)c);
    return 0;
}
