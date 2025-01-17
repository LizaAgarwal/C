//Write C program to count even and odd elements in an array
#include<stdio.h>
int main() {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11};

    int count_even=0;
    int count_odd=0;

    for (int i=0;i<11;i++){
        if (arr[i]%2==0){
            count_even=count_even+1;
            //printf("%d",count_even);
        }
        else{
            count_odd=count_odd+1;
        }
    }
    printf("%d\n",count_odd);
    printf("%d\n",count_even);
    return 0;
}