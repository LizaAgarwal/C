//Write C program count total duplicate elements in an array
#include<stdio.h>
int main() {
    int arr[]={1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
    
    int count=0;
    for (int i=0;i<20;i++){
        for (int j=i+1;j<20;j++){
            if (arr[i]==arr[j]){
                count=count+1;
            }
        }
    }
    printf("%d",count);
    return 0;
}