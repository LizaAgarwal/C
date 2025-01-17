//Write C program to read array elements and print the value with the addresses
#include<stdio.h>
int main() {
    int arr[100];
    int *ptr=arr;
    int num;
    printf("enter the size of array:");
    scanf("%d",&num);
    printf("enter elements in the array:");
    for (int i=0;i<num;i++){
        scanf("%d",ptr+i);
    }
    printf("printing the addresses of the values:");
    for(int i=0;i<num;i++){
        printf("value=%d\taddress=%u\n",*(ptr+i),(ptr+i));
    }
    return 0;
}