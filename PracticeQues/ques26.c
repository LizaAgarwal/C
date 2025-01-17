//Write C program to count total number of negative elements in array
#include<stdio.h>
int main() {
    int arr[]={1,2,3,7,-9,0,-4,-6,-8,-7};

    int count=0;
    for (int i=0;i<10;i++){
        if (arr[i]<0){
            count=count+1;
        }
    }
    printf("%d",count);
    return 0;
}