//Write C program to copy all elements of one array to another
#include<stdio.h>
int main() {
    int first[]={1,2,3,4,5};
    int second[5];

    for (int i=0;i<5;i++){
        second[i]=first[i];
    }    
    printf("elements in the second array are:");
    for (int i=0;i<5;i++){
        printf("%d\t",second[i]);
    }  
    return 0; 
}