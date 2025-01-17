//C Program to Calculate Percentage Marks & Division
#include<stdio.h>
#include<string.h>
int main() {
    int m,p,c,total;
    float percentage;
    char div[5];
    printf("enter marks of maths");
    scanf("%d",&m);
    printf("enter marks of physics");
    scanf("%d",&p);
    printf("enter marks of chemistry");
    scanf("%d",&c);
    total=m+p+c;
    percentage=(float)total/3;
    printf("percentage is %f",percentage);
    if (percentage>=70 && percentage<80){
        strcpy(div,"avrg");
    }
    else if(percentage>=80 && percentage<90){
        strcpy(div,"good");
    }
    else if(percentage>=90 && percentage<100){
        strcpy(div,"outst");
    }
    else{
        strcpy(div,"fail");
    }
    printf("division is %s",div);
    return 0;
}