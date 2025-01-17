//write a program to print number in words
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    //store reverse of a number
    int num=0;
    while(n!=0){
        num=(num*10)+ (n%10);
        n=n/10;
    }
    while (num!=0){
        switch (num%10){
            case 0:
            printf("zero");
            break;
            case 1:
            printf("one");
            break;
            case 2:
            printf("two");
            break;
            case 3:
            printf("three");
            break;
            case 4:
            printf("four");
            break;
            case 5:
            printf("five");
            break;
            case 6:
            printf("six");
            break;
            case 7:
            printf("seven");
            break;
            case 8:
            printf("eight");
            break;
            case 9:
            printf("nine");
            break;
        }

        num=num/10;
    }
return 0;
}
