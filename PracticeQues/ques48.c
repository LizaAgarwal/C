//C Program to find the Size of data types.
#include<stdio.h>
int main() {
    int int_type;
    float float_type;
    char char_type;
    long long_type;
    short short_type;
    double double_type;

    printf("size of int is %d bytes",sizeof(int_type));
    printf("size of float is %d bytes",sizeof(float_type));
    printf("size of char is %d bytes",sizeof(char_type));
    printf("size of long is %d bytes",sizeof(long_type));
    printf("size of short is %d bytes",sizeof(short_type));
    printf("size of double is %d bytes",sizeof(double_type));
    return 0;
}