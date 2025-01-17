//Write C Program input and print array elements using pointer
#include<stdio.h>
int main() {
    int arr[100];
    int *ptr=arr;
    int num;
    printf("enter the size :");
    scanf("%d",&num);
    printf("enter the elements in array:");
    for (int i=0;i<num;i++){
        scanf("%d",ptr);
        ptr++;
    }
    ptr=arr;

    printf("print elements in array:");
    for (int i=0;i<num;i++){
        printf("%d",*ptr);
        ptr++;
    }
    return 0;
}