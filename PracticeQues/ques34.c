//Write C program to put even and odd elements of array in two separate array
#include<stdio.h>
#define MAX_SIZE 1000
int main() {
    int n;
    printf("enter size:");
    scanf("%d",&n);
    int merge[n];

    printf("enter the elements in the array:");
    for (int i=0;i<n;i++){
        scanf("%d\n",&merge[i]);
    }

    int odd[MAX_SIZE];
    int even[MAX_SIZE];
    int evencount=0;
    int oddcount=0;

    for (int i=0;i<n;i++){
        if(merge[i]%2==0){
            even[evencount]=merge[i];
            evencount++;
        }
        else{
            odd[oddcount]=merge[i];
            oddcount++;
        }
    }
    printf("array of even numbers:%d",even[evencount]);
    printf("array of odd elements:%d",odd[oddcount]);
    return 0;
}

   