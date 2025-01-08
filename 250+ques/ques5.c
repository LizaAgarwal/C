//find the percentage of 5 subjects and print grade
#include<stdio.h>
int main() {
    int a,b,c,d,e;
    printf("enter the marks in 5 subjects:");
    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    float per=(float)(a+b+c+d+e)/5.0;
    printf("percentage is:%f\n",per);
    printf("grade is:");
    if (per>90 && per<=100){
        printf("A+");
    }
    else if(per>80 && per<=90){
        printf("A");
    }
    else if(per>70 && per<=80){
        printf("B");
    }
    else if(per>60 && per<=70){
        printf("C");
    }
    else{
        printf("Fail");
    }
    return 0;
}