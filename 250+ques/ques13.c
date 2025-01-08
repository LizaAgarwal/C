//display the size of different data type
#include<stdio.h>
int main() {
    int integer;
    float f;
    char ch;
    double d;
    long l;
    short s;
    printf("size of int data type is %2d bytes\n",sizeof(integer));
    printf("size of float data type is %2d bytes\n",sizeof(f));
    printf("size of char data type is %2d bytes\n",sizeof(ch));
    printf("size of double data type is %2d bytes\n",sizeof(d));
    printf("size of long data type is %2d bytes\n",sizeof(l));
    printf("size of short data type is %2d bytes\n",sizeof(s));
    return 0;
}