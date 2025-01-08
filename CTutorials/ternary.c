#include<stdio.h>

int main() {
    int age;
    printf("enter age");
    scanf("%d",&age);

    (age>18)? printf("he is an adult"):printf("he is not an adult");
    return 0;
}