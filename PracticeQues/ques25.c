//Write a C program to print all negative elements in an array.
#include<stdio.h>
int main() {
    int arr[]={1,2,3,7,-9,0,-4,-6,-8};

    for (int i=0;i<9;i++){
        if (arr[i]<0){
            printf("%d\n",arr[i]);
        }
    }
    return 0;
}

    
    


    