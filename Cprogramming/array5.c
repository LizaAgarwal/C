//write a func to reverse an array

#include<stdio.h>
void rev(int arr[], int n);
void printarr(int arr[], int n);

int main() {
    int arr[] ={1,2,3,4,5,6};
    rev(arr,6);
    printarr(arr,6);
    return 0;
}


void rev(int arr[], int n) {
    for (int i=0; i<n/2; i++) {
        int firstval= arr[i];
        int secval= arr[n-i-1];
        arr[i]= secval;
        arr[n-i-1]= firstval; 
    }
}

void printarr(int arr[], int n) {
    for (int i=0; i<n; i++){
        printf("%d\t",arr[i]);
    }
}





