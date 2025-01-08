//malloc(memory allocation) takes number of bytes to be allocated and returns a pointer of type void
//syntax: ptr=(datatype*)malloc(n*size of (datatype))

//write a program to allocate memory to store 5 integers

#include<stdio.h>
#include<stdlib.h>

int main() {
    int *ptr;
    ptr=(int*)malloc(5*sizeof(int));

    ptr[0]=1;
    ptr[1]=2;
    ptr[2]=3;
    ptr[3]=4;
    ptr[4]=5;

    for (int i=0;i<5;i++){
        printf("%d\n",ptr[i]);
    }
    return 0;

}