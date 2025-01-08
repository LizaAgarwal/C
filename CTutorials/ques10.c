//print reverse of the table for a given number
#include<stdio.h>

int main() {
    int n;
    printf("enter number");
    scanf("%d",&n);

    for (int i=10; i>=1; i=i-1) {
        printf("%d\n",n*i);
    }
    return 0;
}