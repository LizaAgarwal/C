//create a structure to store complex numbers(use arrow operator)

#include<stdio.h>

struct complex{
    int real;
    int img;
};

int main() {
    struct complex n1={4,7};
    struct complex *ptr;
    ptr=&n1;
    printf("real part is %d\n",ptr->real);
    printf("img part is %d\n",ptr->img);
    return 0;
}