//Array is a collection of similar data types stored at contiguous memory location
#include<stdio.h>

int main() {

    int marks[]= {96,97,98};
    char star[] ={'*','#','@'};
    float number[]= {22.0,87.9,90.7};

    printf("marks=%d\n",marks[0]);
    printf("star is=%c\n",star[0]);
    printf("numbers is=%f\n",number[1]);
    return 0;
}