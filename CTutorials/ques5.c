//print the sum of first n natural numbers and also print reverse of the numbers
#include<stdio.h>

int main() {
    int n;
    printf("enter number");
    scanf("%d",&n);

    int sum=0;
    for (int i=1; i<=n; i=i+1) {
        sum=sum+i;
    }
    printf("%d\n",sum);

    for (int i=n; i>=1; i=i-1) {
        printf("%d\n",i);
    }
    return 0;

}