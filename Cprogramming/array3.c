//write a func to count the number of odd numbers in an array
#include<stdio.h>

int countodd(int arr[], int n);

int main() {
    int arr[5]= {1,2,3,4,5};
    printf("%d",countodd(arr,5));
    return 0;
}

int countodd(int arr[], int n) {
    int count= 0;
    for (int i=0; i<n; i++) {
        if (arr[i]%2!=0) {
            count++;
        }
    }
    return count;

}