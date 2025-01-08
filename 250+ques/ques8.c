//Convert a Person's Name in Abbreviated
#include<stdio.h>
int main() {
    char fname[10],mname[10],lname[10];
    printf("enter the fisrt, middle and last name:");
    scanf("%s%s%s",fname,mname,lname);
    printf("abbreviated form is:");
    printf("%c.%c.%s",fname[0],mname[0],lname);
    return 0;
}