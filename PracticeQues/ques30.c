//Write C program to sort an array in ascending order
#include<stdio.h>
int main() {
    int arr[]={3,2,5,7,1,10,0};

    for (int i=0;i<7;i++){
        for(int j=i+1;j<7;j++){
            if (arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printf("array in ascending order:");
    for (int i=0;i<7;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}