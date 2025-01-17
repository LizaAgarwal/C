//Write C program to find reverse of an array
#include<stdio.h>
int main() {
    int arr[]={1,2,3,4,5,6,7,8};
    for(int i=7;i>=0;i--){
        printf("%d\t",arr[i]);
    }
    return 0;
}