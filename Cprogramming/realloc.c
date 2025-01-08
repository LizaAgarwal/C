//realloc(re- allocate) increases or decreases the memory using tha same pointer and size
//syntax: ptr= realloc(ptr, new size) 
//allocate memory for 5 numbers and then dynamically increase it to 8 numbers

#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr= (int*)calloc(5,sizeof(int));
    printf("enter 5 numbers:");
    for(int i=0;i<5;i++){
        scanf("%d",&ptr[i]);
    }

    ptr= realloc(ptr,8);
    printf("enter 8 numbers:");
    for (int i=0;i<8;i++){
        scanf("%d",&ptr[i]);
    }

    for (int i=0;i<8;i++){
        printf("%d\n",ptr[i]);
    }
    return 0;
}