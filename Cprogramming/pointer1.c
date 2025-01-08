//declaring pointers
//int *ptr is used to store the address of int type of variable
//char *ptr is used to store the address of char type of variable
//float *ptr is used to store the address of float type of variable

//"%p" is written when we want to print the address

#include<stdio.h>

int main() {
    int age=22;
    int *ptr= &age;
    printf("%p\n",ptr);
    printf("%p\n",&age);
    printf("%p\n",&ptr);
    return 0;
}