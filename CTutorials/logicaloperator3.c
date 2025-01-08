//print 1 or 0 for the statement if a no is greater then 9 &less than 100 then print 1 to chech whether a no is a 2 digit no

#include<stdio.h>

int main() {

    int a;
    printf("enter no");
    scanf("%d",&a);

    printf("%d",a>9&&a<100);
    return 0;
}