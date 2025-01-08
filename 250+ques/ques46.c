//print the sum of diagonal elements of a square matrix 
#include<stdio.h>
int main() {
    int n,num;
    int sum=0;
    printf("enter the dimension of a square matrix:");
    scanf("%d",&n);
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            printf("enter the element of the matrix:");
            scanf("%d",&num);
            if (i==j){
                sum=sum+num;
            }
        }
    }
    printf("sum of the diagonal element is:%d",sum);
    return 0;
}