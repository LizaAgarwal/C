//we can also subtract one pointer from another pointer
#include<stdio.h>

int main() {
    int age=22;
    int *ptr= &age;

    int _age=24;
    int *_ptr= &_age;

    printf("%u,%u\n",ptr,_ptr);
    printf("difference is %d\n",_ptr-ptr);
    return 0;
}