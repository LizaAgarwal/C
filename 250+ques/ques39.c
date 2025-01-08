//Print Multiplication Table using for loop
#include<stdio.h>
int main() {
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    printf("multiplication table of %d is:\n",n);
    int a;
    for(int i=1;i<=10;i++){
        a=n*i;
        printf("%dx%d=%d\n",n,i,a);
    }
    return 0;
}