//structure is a collection of values of different datatypes
#include<stdio.h>
#include<string.h>
 struct student {
    int roll;
    float cgpa;
    char name[100];
 };

int main(){
    struct student s1;
    s1.roll= 607;
    s1.cgpa=9.5;
    strcpy(s1.name,"liza");

    printf("student name= %s\n",s1.name);
    printf("roll no =%d\n",s1.roll);
    printf("cgpa is=%f\n",s1.cgpa);

    return 0;
}
 
 