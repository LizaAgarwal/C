//pointer can be incremented or decremented
//int datatype consumes 4 bytes of memory
//float datatype consumes 4 bytes of memory
//char datatype consumes 1 byte of memory
#include<stdio.h>

int main() {

    int age= 22;
    int *ptr= &age;
    printf("%u\n",ptr);
    ptr++;
    printf("%u\n",ptr);
    ptr--;
    printf("%u\n",ptr);
    return 0;
}