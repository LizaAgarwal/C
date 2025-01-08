//sum of numbers from 5 to 50
#include<stdio.h>

int main() {
    int sum=0;
    for (int i=5; i<=50; i=i+1) {
        sum=sum+i;
    }
    printf("%d",sum);
    
    return 0;
}