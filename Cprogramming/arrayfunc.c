#include<stdio.h>

void printnumbers(int arr[], int n);

int main() {

    int arr[5]={1,2,3,4,5};
    printnumbers(arr,5);
    return 0;
}

void printnumbers(int arr[], int n) {
    for (int i=0; i<n; i++) {
        printf("%d\t",arr[i]);
    }
}