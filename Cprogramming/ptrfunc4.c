#include<stdio.h>

void great(int *a, int *b);

int main() {

    int a=5;
    int b=6;
    great(&a,&b);
    return 0;
}

void great(int *a, int *b) {
    if (*a>*b){
        printf("%d is largest\n",a);
    }
    else {
        printf("%d is largest\n",b);
    }

}