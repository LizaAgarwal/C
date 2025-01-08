//pointer to pointer is a variable that stores the memory address of pointer variable
//int **pptr is used to store the address of int type of variable
//char **pptr is used to store the address of char type of variable
//float **pptr is used to store the address of float type of variable

#include<stdio.h>

int main() {

    float price=100.00;
    float *ptr= &price;
    float **pptr= &ptr;
    printf("%p\n",&price);
    printf("%p\n",ptr);
    printf("%p\n",pptr);
    return 0;

}