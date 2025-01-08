//pointer is a variable that stores the memory address of another variable
#include<stdio.h>

int main() {

    int age=22;
    int *ptr= &age; //*ptr means value at pointer variable and &age means address at age variable
    int _age= *ptr;
    printf("%d",_age);
    return 0;

}