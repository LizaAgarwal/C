//Sort A Float Array In descending Order Using for loop
#include<stdio.h>
int main() {
    int arr[100];
    int size;
    printf("enter the size of the array:");
    scanf("%d",&size);
    printf("enter the elements in the array:");
    for (int i=0;i<size;++i){
        scanf("%d",&arr[i]);
    }
    printf("array before sorting:");
    for (int i=0;i<size;++i){
        printf("%d\t",arr[i]);
    }
    for (int i=0;i<size;++i){
        for (int j=i+1;i<size;++j){
            if (arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printf("elements after sorting is:");
    for (int i=0;i<size;++i){
        printf("%d\t",arr[i]);
    }
    return 0;
}