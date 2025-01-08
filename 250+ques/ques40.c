//Sort A Float Array In Ascending Order Using for loop
#include<stdio.h>
int main() {
    int arr[100];
    int size,i;
    printf("enter the size of the array:\n");
    scanf("%d",&size);
    printf("enter the elements in the array:");
    for (i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("array before sorting is:\n");
    for (i=0;i<size;i++){
        printf("%d\t",arr[i]);
    }
    for (i=0;i<size;i++){
        for (int j=i+1;j<size;j++){
            if (arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    printf("array after sorting is:\n");
    for (int i=0;i<size;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}