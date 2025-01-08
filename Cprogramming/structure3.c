#include<stdio.h>

struct student {
    char name[100];
    int roll;
    float cgpa;
};

int main() {
    struct student s1={"liza",607,9.8};
    printf("roll is=%d\n",s1.roll);
    printf("cgpa is= %f\n",s1.cgpa);
    printf("name=%s\n",s1.name);
    return 0;
}
