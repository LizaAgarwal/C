//Write C program to find maximum and minimum element in array
#include<stdio.h>
int main() {
    int arr[]={1,2,3,4,5,6,7};
    
    int max=arr[0];
    int min=arr[0];

    for (int i=0;i<8;i++){
        if (arr[i]>max){
            max=arr[i];
        }
        if (arr[i]<min){
            min=arr[i];
        }
    }
    printf("%d\n",max);
    printf("%d\n",min);
    return 0;
}