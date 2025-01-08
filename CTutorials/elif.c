//else-if condition
#include<stdio.h>

int main() {

    int age;
    printf("enter age");
    scanf("%d",&age);

    if (age>18) {
        printf("he is an adult");
    }
    else if (age>=13 && age<=18) {
        printf("he is a teenager");
    }
    else {
        printf("he is a child");
    }
    return 0;
}