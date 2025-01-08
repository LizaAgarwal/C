//print the sum of n numbers by taking input from the user using for loop
#include<stdio.h>
int main() {
    int n,num;
    printf("enter the no. of times u want to take input from the user:");
    scanf("%d",&n);
    int sum=0;
    for (int i=0;i<n;i++){
        printf("enter the number:");
        scanf("%d",&num);
        sum=sum+num;
    }
    printf("sum is %d",sum);
    return 0;
}