//sum of any two numbers using function
#include<stdio.h>

int sum(int a, int b);

int main() {
    int a;
    printf("enter a");
    scanf("%d",&a);

    int b;
    printf("enter b");
    scanf("%d",&b);

    int s=sum(a,b);
    printf("sum is %d",s);
    return 0;
}

int sum(int a,int b) {
    return a+b;
}