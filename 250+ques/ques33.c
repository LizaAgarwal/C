//Calculate Sum of Natural Numbers
#include<stdio.h>
int main() {
    int n;
    printf("enter any number:");
    scanf("%d",&n);
    int sum=0;
    int count=1;
    while (count<=n){
        sum=sum+count;
        count++;
    }
    printf("sum is %d",sum);
    return 0;
}