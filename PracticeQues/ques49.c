//C Program to convert days to years, weeks and days
#include<stdio.h>
int main() {
    int days;
    printf("enter the no of days:");
    scanf("%d",&days);

    int year,weeks;
    year= days/365;
    weeks=(days%365)/7;
    days=days-((year*365)+weeks);
    
    printf("%d\n",days);
    printf("%d\n",weeks);
    printf("%d\n",year);
    return 0;
}