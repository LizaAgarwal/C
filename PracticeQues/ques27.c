//Write a C program to read and print elements of array
#include<stdio.h>
int main() {
    int n;
    printf("enter size of array:");
    scanf("%d",&n);
    int arr[n];

    printf("enter %d elements in the array\n",n);
    for (int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    } 

    printf("elements in the array are:");
    for (int i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    return 0;

}