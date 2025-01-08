//swap a and b where a=3 and b=5 by call by reference
#include<stdio.h>

void swap(int *a, int *b);

int main() {
    int a=3; 
    int b=5;
    swap(&a,&b);
    printf("a=%d & b=%d",a,b);
    return 0;
}

void swap(int *a, int *b) {
    int c= *b;
    *b=*a;
    *a=c;
    printf("a=%d & b=%d\n",*a,*b);
}