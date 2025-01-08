//print all odd numbers from 5 to 50
#include<stdio.h>

int main() {
    for (int i=5; i<=50; i=i+1) {
        if (i%2==0) {
            continue;
        }
        printf("%d\n",i);
    }
    return 0;
}